package com.pplbo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OutBoxMessageConsumer {

    @KafkaListener(topics = "unprocessed-order-event", groupId = "jt-group")
    public void consume(String payload) {
        log.info("Event consumed: " + payload);
    }
}
