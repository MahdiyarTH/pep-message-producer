package com.pep.messageproducer.message.model;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private Type type;

    private String body;

    private String sender;

    public enum Type {
        INFO,
        ERROR,
        WARNING
    }

}
