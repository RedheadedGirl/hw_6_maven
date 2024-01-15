package org.example.social.interfaces;

public interface Watchable {

    /**
     * Посмотреть фото
     * @param id id фотографии
     * @return путь к фотографии
     */
    String watchPhoto(String id);

    /**
     * Скачать фото
     * @param id id фотографии
     * @return ссылка на скачивание
     */
    String downloadPhoto(String id);

}
