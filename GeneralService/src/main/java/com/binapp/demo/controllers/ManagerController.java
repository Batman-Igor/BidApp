package com.binapp.demo.controllers;

import com.binapp.demo.objects.Bid;
import com.binapp.demo.statuses.BidStatuses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ManagerController {

    boolean mon;
    List<Bid> list;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplateEmail;

    @KafkaListener(topics = "ManagerBidList")
    public void setMon(List<Bid> bidList) {
        mon = true;
        list = bidList;
    }

    @GetMapping(path = "/manager-platform")
    public String getManager(Authentication authentication, Model model) {

        String role = Arrays.toString(authentication.getAuthorities().toArray());
        if (!role.intern().equals("[ROLE_MANAGER]")) {
            return "error";
        }

        mon = false;
        kafkaTemplateEmail.send("ManagerAllBidList", BidStatuses.CONSIDERING);

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

        model.addAttribute("bids", list);
        model.addAttribute("name", authentication.getName());
        model.addAttribute("role", Arrays.toString(authentication.getAuthorities().toArray()));
        return "manager";
    }
}
