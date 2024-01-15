package org.example.social.interfaces;

import org.example.social.dto.ChatHistory;

import java.util.List;

public interface Chatable {

    /**
     * Начать чат
     * @param idFirstUser id инициатора
     * @param idSecondUser id получателя
     * @return id чата
     */
    String startChat(String idFirstUser, String idSecondUser);

    /**
     * Скачать фото
     * @param id id чата
     * @return ссылка на скачивание
     */
    List<ChatHistory> getChatHistory(String id);

}
