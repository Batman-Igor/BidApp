package com.binapp.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class BaseController {

    // Main link
    @GetMapping(path = "/")
    public String getMain(Authentication authentication, Model model) {
        String role = Arrays.toString(authentication.getAuthorities().toArray());
        if (role.equals("[ROLE_USER]")) {
            return "redirect:/user-platform";
        } else {
            return "redirect:/manager-platform";
        }
    }

    // User platform
    @GetMapping(path = "/user-platform")
    public String getUser(Authentication authentication, Model model) {

        String role = Arrays.toString(authentication.getAuthorities().toArray());
        if (!role.intern().equals("[ROLE_USER]")) {
            return "error";
        }

        model.addAttribute("name", "Ob1");
        model.addAttribute("role", Arrays.toString(authentication.getAuthorities().toArray()));
        return "user";
    }

    // Manager platform
    @GetMapping(path = "/manager-platform")
    public String getManager(Authentication authentication, Model model) {

        String role = Arrays.toString(authentication.getAuthorities().toArray());
        if (!role.intern().equals("[ROLE_MANAGER]")) {
            return "error";
        }

        model.addAttribute("name", "Dart Vaider");
        model.addAttribute("role", Arrays.toString(authentication.getAuthorities().toArray()));
        return "manager";
    }
}
