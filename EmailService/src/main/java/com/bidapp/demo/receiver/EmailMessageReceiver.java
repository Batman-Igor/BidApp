package com.bidapp.demo.receiver;

import com.bidapp.demo.objects.Bid;
//import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailMessageReceiver {

//    @Autowired
//    KafkaTemplate<String, Bid> kafkaTemplate;

//    @KafkaListener(
//            topics = "BidTopic",
//            groupId = "bid_json",
//            containerFactory = "bidKafkaListenerFactory"
//    )
//    public void consumeJson(Bid bid) {
//        System.out.println("Consumed message: " + bid.toString());
//    }
}
