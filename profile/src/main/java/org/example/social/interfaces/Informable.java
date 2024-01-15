package org.example.social.interfaces;

import org.example.social.dto.Chat;
import org.example.social.dto.Info;

import java.util.Optional;

public interface Informable {

    /**
     * Получить информацию по профилю
     * @param idUser id профиля
     * @return optional информация
     */
    Optional<Info> getInfo(String idUser);

    /**
     * Начать чат
     * @param idFirstUser id инициатора
     * @param idSecondUser id получателя
     * @return ссылка на скачивание
     */
    Chat startChat(String idFirstUser, String idSecondUser);

}
