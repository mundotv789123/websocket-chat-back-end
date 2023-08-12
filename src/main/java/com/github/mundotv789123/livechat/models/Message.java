package com.github.mundotv789123.livechat.models;

import jakarta.persistence.*;
import lombok.Getter;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message {
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) @Getter int id;
    private @Getter @Column(columnDefinition = "TEXT") String message;
    private @Getter String author;
    private @Getter LocalDateTime createdAt = LocalDateTime.now();

    public Message() { }

    public Message(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public static  class MessageDTO {
        private @Getter String message, author;

        public Message toEntity() {
            return new Message(this.message, this.author);
        }
    }
}
