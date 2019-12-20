package com.bidapp.demo.services;

import com.bidapp.demo.objects.Bid;
import com.bidapp.demo.repositorys.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidService {

    @Autowired
    private BidRepository bidRepository;

    public List<Bid> getBidList() {
        return bidRepository.findAll();
    }

    public List<Bid> getBidListByName(String email) {
        return bidRepository.findBidByEmail(email);
    }

    public List<Bid> getBidListByStatus(String status) {
        return bidRepository.findBidByStatus(status);
    }

    public void saveToDb(Bid bid) {
        bidRepository.save(bid);
    }

    public void updateStatus(String title, String date, String status) {
        bidRepository.updateBid(title, date, status);
    }
}
