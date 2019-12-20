package com.binapp.demo.controllers;

import com.binapp.demo.objects.Bid;
import com.binapp.demo.statuses.BidStatuses;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Date;

@Controller
public class UserController {

    @Autowired
    KafkaTemplate<String, Bid> kafkaTemplate;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplateEmail;

    @Value("${user.email}")
    String userEmail;

    @GetMapping(path = "/user-platform")
    public String getUser(Authentication authentication, Model model) {

        String role = Arrays.toString(authentication.getAuthorities().toArray());
        if (!role.intern().equals("[ROLE_USER]")) {
            return "error";
        }

        model.addAttribute("name", authentication.getName());
        model.addAttribute("role", Arrays.toString(authentication.getAuthorities().toArray()));
        return "user";
    }

    @PostMapping("/send")
    public String sendBid(@RequestParam String title, @RequestParam String data) {
        Bid bid = new Bid(title, data, userEmail, new Date().toString(), BidStatuses.CONSIDERING);
        System.out.println(bid.toString());
        kafkaTemplate.send("BidTopic", bid);
        kafkaTemplate.send("SendStatus", bid);
        return "redirect:/user-platform";
    }
}
