package org.example.social.interfaces;

import org.example.social.dto.GiftEntity;
import org.example.social.dto.Present;

import java.util.List;

public interface Giveable {

    /**
     * Подарить подарок. Данный метод сохраняет в бд соответстующую запись
     * @param present подарок
     * @return id сохраненной записи
     */
    String giveGift(Present present);

    /**
     * Выбрать подарок
     * @param gifts список подарков подарок
     * @return id подарка
     */
    String chooseGift(List<GiftEntity> gifts);

}
