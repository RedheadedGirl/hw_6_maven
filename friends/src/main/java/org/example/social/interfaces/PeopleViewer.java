package org.example.social.interfaces;

import org.example.social.dto.Person;

import java.util.List;

public interface PeopleViewer {

    /**
     * Метод возвращает результат поиска по имени
     * @param name имя пользователя
     * @return список найденных людей
     */
    List<Person> findPeopleByName(String name);

    /**
     * Добавление человека в друзья
     * @param id id добавляемого человека
     * @return успешность операции
     */
    boolean addPersonToFriends(String id);

    /**
     * Просмотр профиля
     * @param id id профиля
     * @return данные профиля
     */
    Person openPersonProfile(String id);
}
