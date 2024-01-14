package org.example.social.interfaces;

import org.example.social.dto.GiftEntity;
import org.example.social.dto.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

class RecommenderTest {

    @Mock
    Recommender recommender;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void givenIdUser_whenRecommendGift_thenReturnGift() {
        GiftEntity gift = new GiftEntity();
        gift.setComment("С Новым годом");
        when(recommender.recommendGift("5")).thenReturn(Optional.of(gift));

        Optional<GiftEntity> giftEntity = recommender.recommendGift("5");
        assertTrue(giftEntity.isPresent());
        assertEquals("С Новым годом", giftEntity.get().getComment());
    }

    @Test
    void givenIdUser_whenRecommendPerson_thenReturnPerson() {
        Person person = new Person();
        person.setName("Вася");
        when(recommender.recommendPerson()).thenReturn(Optional.of(person));

        Optional<Person> personOptional = recommender.recommendPerson();
        assertTrue(personOptional.isPresent());
        assertEquals("Вася", personOptional.get().getName());
    }
}