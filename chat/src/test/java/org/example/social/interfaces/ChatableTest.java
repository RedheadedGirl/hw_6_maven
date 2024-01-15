package org.example.social.interfaces;

import org.example.social.dto.ChatHistory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ChatableTest {

    @Mock
    Chatable chatable;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void startChat() {
        when(chatable.startChat("1", "2")).thenReturn("987");
        String started = chatable.startChat("1", "2");
        assertEquals("987", started);
    }

    @Test
    void getChatHistory() {
        when(chatable.getChatHistory("987")).thenReturn(List.of(new ChatHistory("987", "привет", LocalDateTime.now()),
                new ChatHistory("987", "как дела", LocalDateTime.now())));

        List<ChatHistory> chatHistory = chatable.getChatHistory("987");
        assertEquals(2, chatHistory.size());
    }
}