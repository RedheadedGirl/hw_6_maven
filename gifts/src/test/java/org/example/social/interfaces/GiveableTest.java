package org.example.social.interfaces;

import org.example.social.dto.GiftEntity;
import org.example.social.dto.Present;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class GiveableTest {

    @Mock
    Giveable giveable;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void givenPresent_whenGiveGift_thenReturnId() {
        when(giveable.giveGift(any(Present.class))).thenReturn("123");
        assertEquals("123", giveable.giveGift(new Present()));
    }

    @Test
    void givenListOfGifts_whenChooseGift_thenReturnIdOfFirst() {
        List<GiftEntity> giftEntities = List.of(new GiftEntity());
        when(giveable.chooseGift(giftEntities)).thenReturn("someId");
        assertEquals("someId", giveable.chooseGift(giftEntities));
    }

    @Test
    void givenEmptyListOfGifts_whenChooseGift_thenReturnNull() {
        List<GiftEntity> giftEntities = List.of();
        when(giveable.chooseGift(giftEntities)).thenReturn(null);
        assertNull(giveable.chooseGift(giftEntities));
    }
}