package com.kafkaService.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PersonConsumer {

    @KafkaListener(id="person-listner",
            topics = "${reader.topic.consumer}",
            groupId = "${reader.consumer-group-id}")
    public void consumer (String content){

    }

}
