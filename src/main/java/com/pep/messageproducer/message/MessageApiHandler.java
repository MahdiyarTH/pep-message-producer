package com.pep.messageproducer.message;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageApiHandler {

    private final MessageFeignClient messageFeignClient;

}
