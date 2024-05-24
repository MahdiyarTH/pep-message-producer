package com.pep.messageproducer;

import com.pep.messageproducer.message.MessageFeignClient;
import com.pep.messageproducer.message.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = "com.pep")
public class MessageProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageProducerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MessageFeignClient messageFeignClient) {
        return args -> {
            messageFeignClient.createMessage(
                    Message.builder()
                            .body("Hello")
                            .type(Message.Type.ERROR)
                            .sender("Mahdiyar")
                            .build()
            );
        };
    }
}
