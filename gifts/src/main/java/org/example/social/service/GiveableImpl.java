package org.example.social.service;

import org.example.social.dto.GiftEntity;
import org.example.social.dto.Present;
import org.example.social.interfaces.Giveable;

import java.util.List;

public class GiveableImpl implements Giveable {
    @Override
    public String giveGift(Present present) {
        // допустим сохранили
        return present.toString();
    }

    @Override
    public String chooseGift(List<GiftEntity> gifts) {
        if (gifts.isEmpty()) {
            return null;
        }
        return gifts.get(0).getId();
    }
}
