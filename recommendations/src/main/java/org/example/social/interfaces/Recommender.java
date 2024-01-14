package org.example.social.interfaces;

import org.example.social.dto.GiftEntity;
import org.example.social.dto.Person;

import java.util.Optional;

public interface Recommender {

    /**
     * Метод возвращает рекомендуемый пользователю подарок
     * @param idUser id пользователя
     * @return optional подарка
     */
    Optional<GiftEntity> recommendGift(String idUser);

    /**
     * Метод возвращает рекомендуемого пользователю друга
     * @return optional подарка
     */
    Optional<Person> recommendPerson();
}
