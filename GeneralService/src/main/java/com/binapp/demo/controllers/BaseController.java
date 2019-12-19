package com.binapp.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allan on 19.12.2019.
 */
@RestController
public class BaseController {

    @GetMapping(path = "/")
    public String getMain() {
        return "Main";
    }
}
