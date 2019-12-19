package com.bidapp.demo.controllers;

import com.bidapp.demo.objects.Bid;
import com.bidapp.demo.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DBController {

    @Autowired
    private BidService service;

    @GetMapping("/bids")
    public List<Bid> getBidsList() {
        return service.getBidList();
    }
}
