package com.pep.messageproducer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MessageProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageProducerApplication.class, args);
    }

}
