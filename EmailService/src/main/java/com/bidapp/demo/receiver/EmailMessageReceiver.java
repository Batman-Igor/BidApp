package com.bidapp.demo.receiver;

import com.bidapp.demo.objects.Bid;
//import org.springframework.kafka.annotation.KafkaListener;
import com.bidapp.demo.sender.ActiavationMailSender;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmailMessageReceiver {

    @Autowired
    ActiavationMailSender sender;

    ObjectMapper mapper = new ObjectMapper();

    @KafkaListener(topics = "SendStatus", groupId = "group_id")
    public void sendEmailToUser(String message) throws JsonProcessingException {
        Bid bid = mapper.readValue(message, Bid.class);
        sender.send(
                bid.getEmail(),
                bid.getTitle(),
                "Bid (" + bid.toString() + ") updated!"
                );
    }
}
