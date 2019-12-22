package com.binapp.demo.controllers;

import com.binapp.demo.objects.Bid;
import com.binapp.demo.statuses.BidStatuses;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.*;

@Controller
public class UserController {

    @Autowired
    KafkaTemplate<String, Bid> kafkaTemplate;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplateEmail;

    @Value("${user.email}")
    String userEmail;

    boolean mon;
    private List<LinkedHashMap> list;

    @KafkaListener(
            topics = "UsersBidList",
            groupId = "bids",
            containerFactory = "bidsKafkaListenerFactory"
    )
    public void setMon(List<LinkedHashMap> bidList) {
        mon = true;
        list = bidList;
    }


    @GetMapping(path = "/user-platform")
    public String getUser(Authentication authentication, Model model) throws IOException {

        String role = Arrays.toString(authentication.getAuthorities().toArray());
        if (!role.intern().equals("[ROLE_USER]")) {
            return "error";
        }

        mon = false;
        kafkaTemplateEmail.send("BidList",userEmail);
        System.out.print("Waiting");
        while (!mon) {
            System.out.print(".");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

        int approved = 0;
        int denied = 0;
        if (!list.isEmpty()) {
            for (LinkedHashMap l : list) {
                switch (String.valueOf(l.get("status"))) {
                    case "APPROVED":
                        approved++;
                        break;
                    case "DENIED":
                        denied++;
                        break;
                }
            }
        }

        model.addAttribute("bids", list);
        model.addAttribute("name", authentication.getName());
        model.addAttribute("email", userEmail);
        model.addAttribute("role", "Bids Creator");
        model.addAttribute("total", list.size());
        model.addAttribute("approved", approved);
        model.addAttribute("denied", denied);

        kafkaTemplateEmail.send("BidList",authentication.getName());

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
