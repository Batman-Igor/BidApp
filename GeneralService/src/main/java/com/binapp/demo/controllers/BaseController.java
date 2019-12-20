package com.binapp.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class BaseController {

    @GetMapping(path = "/")
    public String getMain(Authentication authentication) {
        String role = Arrays.toString(authentication.getAuthorities().toArray());
        if (role.equals("[ROLE_USER]")) {
            return "redirect:/user-platform";
        } else {
            return "redirect:/manager-platform";
        }
    }

}
