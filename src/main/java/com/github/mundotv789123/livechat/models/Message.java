package com.github.mundotv789123.livechat.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Message {
    private @Getter @Setter String message, author;
}
