package org.example.social.interfaces;

import org.example.social.dto.Chat;
import org.example.social.dto.Info;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class InformableTest {

    @Mock
    Informable informable;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void givenIdUser_whenGetInfo_thenReturn() {
        when(informable.getInfo("12")).thenReturn(Optional.of(new Info()));
        Optional<Info> info = informable.getInfo("12");
        assertTrue(info.isPresent());
    }

    @Test
    void givenIds_whenStartChat_thenReturnChat() {
        when(informable.startChat("1", "2")).thenReturn(new Chat());
        assertNotNull(informable.startChat("1", "2"));
    }
}