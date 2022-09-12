package tdd.learn.card.user.service;

import java.util.stream.Stream;

public enum CardStatusEnum {
    SUCCESS(1, "00"),

    INVALID(2, "01"),
    INACTIVE(3, "02"),
    LOCKED(4, "03");
    Integer type;
    String description;

    CardStatusEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public CardStatusEnum getStatus(Integer type) {
        return Stream.of(CardStatusEnum.values()).filter(s-> s.type.equals(type)).findAny().orElse(null);
    }
}
