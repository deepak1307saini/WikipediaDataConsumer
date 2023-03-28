package com.example.WikipediaDataConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "wikipedia", groupId = "wiki-consumer-group")
    public void listen(String recentData) {
        System.out.println(recentData);
    }
}
