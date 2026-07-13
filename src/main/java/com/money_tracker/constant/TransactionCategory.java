package com.money_tracker.constant;

import java.util.Arrays;
import java.util.List;

public enum TransactionCategory {
    FOOD,
    RENT,
    UTILITIES,
    TRANSPORT,
    HEALTH,
    ENTERTAINMENT,
    OTHER;

    public static List<String> getAllCategories() {
        return Arrays.stream(values()).map(Enum::name).toList();
    }
}
