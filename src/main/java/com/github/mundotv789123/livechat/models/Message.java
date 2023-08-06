package com.github.mundotv789123.livechat.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Message {
    private @Getter String message, author;
}
