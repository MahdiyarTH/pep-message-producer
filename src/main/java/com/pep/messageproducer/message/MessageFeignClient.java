package com.pep.messageproducer.message;

import com.pep.messageproducer.config.FeignConfig;
import com.pep.messageproducer.message.model.Message;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "messages", url = "http://localhost:8080/", configuration = FeignConfig.class)
public interface MessageFeignClient {

    @PostMapping("apis/v1/messages")
    ResponseEntity<Message> createMessage(@RequestBody Message message);

}
