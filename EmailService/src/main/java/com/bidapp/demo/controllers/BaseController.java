package com.bidapp.demo.controllers;

import com.bidapp.demo.sender.ActiavationMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Allan on 19.12.2019.
 */
@RestController
public class BaseController {

    @Autowired
    ActiavationMailSender sender;

    @GetMapping(path = "/")
    public String getMain() {
        sender.send("bsifer@yandex.ru", "Test", "Hello");
        return "Email Main";
    }
}
