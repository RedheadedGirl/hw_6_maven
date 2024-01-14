package org.example.social.dto;

/**
 * Данный класс представляет собой сущность "Подарок" как запись справочника
 */
public class GiftEntity {

    private String id;
    private String picture;
    private String comment;

    public String getId() {
        return id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
