package com.kafkaService.producers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class PersonProducer {
    @Value("${reader.topic.producer}")
    private String topic;

    private final KafkaTemplate<String, String> kafkaTemplate;

    /**
     * doc: https://docs.spring.io/spring-kafka/reference/kafka/sending-messages.html
     * @param message
     */
    public void send(String message){
        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(topic, message);
        future.whenComplete((result, ex) ->{
            if (ex == null) {

            }
            else {

            }
        });
    }



}
