package com.binapp.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class ManagerController {

    @GetMapping(path = "/manager-platform")
    public String getManager(Authentication authentication, Model model) {

        String role = Arrays.toString(authentication.getAuthorities().toArray());
        if (!role.intern().equals("[ROLE_MANAGER]")) {
            return "error";
        }

        model.addAttribute("name", authentication.getName());
        model.addAttribute("role", Arrays.toString(authentication.getAuthorities().toArray()));
        return "manager";
    }
}
