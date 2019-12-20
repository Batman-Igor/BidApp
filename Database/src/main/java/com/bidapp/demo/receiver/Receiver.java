package com.bidapp.demo.receiver;

import com.bidapp.demo.objects.Bid;
import com.bidapp.demo.services.BidService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

    @Autowired
    BidService service;

    @KafkaListener(
            topics = "BidTopic",
            groupId = "bid_id",
            containerFactory = "kafkaListenerContainerFactory"
    )
    public void consumeBid(String incomingBid) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Bid bid = mapper.readValue(incomingBid, Bid.class);
        service.saveToDb(bid);
    }
}
