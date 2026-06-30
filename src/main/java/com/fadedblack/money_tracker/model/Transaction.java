package com.fadedblack.money_tracker.model;

public record Transaction(String type, double value) {
    public static Transaction from(TransactionDTO transaction) {
        return new Transaction(transaction.type(), transaction.value());
    }
}
