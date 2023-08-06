package com.github.mundotv789123.livechat.controllers;

import com.github.mundotv789123.livechat.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Message chat(Message message) {
        message.setMessage(message.getMessage() + " - recived!");
        return message;
    }

}
