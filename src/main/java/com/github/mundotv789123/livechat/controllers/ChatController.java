package com.github.mundotv789123.livechat.controllers;

import com.github.mundotv789123.livechat.models.Message;
import com.github.mundotv789123.livechat.repositories.MessagesRespository;
import org.springframework.data.domain.PageRequest;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class ChatController {

    private final MessagesRespository messagesRespository;

    public ChatController(MessagesRespository messagesRespository) {
        this.messagesRespository = messagesRespository;
    }

    @MessageMapping("/message")
    @SendTo("/topic/chat")
    public Message chat(Message.MessageDTO messageDTO) {
        var message = messageDTO.toEntity();

        messagesRespository.save(message);
        return message;
    }

    @GetMapping("/messages")
    public List<Message> messages() {
        var page = PageRequest.of(0, 10);
        return messagesRespository.findAll(page).toList();
    }
}
