package org.example.social.dto;

import java.time.LocalDateTime;

public class ChatHistory {
    public ChatHistory(String idChat, String message, LocalDateTime timeSent) {
        this.idChat = idChat;
        this.message = message;
        this.timeSent = timeSent;
    }

    private String idChat;
    private String message;
    private LocalDateTime timeSent;
}
