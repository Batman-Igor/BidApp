package com.binapp.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class BaseController {

    @GetMapping(path = "/")
    public String getMain(Authentication authentication, Model model) {
        model.addAttribute("name", "Ob1");
        model.addAttribute("role", Arrays.toString(authentication.getAuthorities().toArray()));
        return "index";
    }
}
