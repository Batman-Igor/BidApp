package com.bidapp.demo.receiver;

import com.bidapp.demo.objects.Bid;
//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmailMessageReceiver {

    @Autowired
    KafkaTemplate<String, Bid> kafkaTemplate;

    @KafkaListener(topics = "BidTopic1", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(
            topics = "BidTopic1",
            groupId = "bid_json",
            containerFactory = "bidKafkaListenerFactory"
    )
    public void consumeJson(Bid bid) {
        System.out.println("Consumed message: " + bid.toString());
    }
}
