package com.money_tracker.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

// public record Transaction(String type, BigDecimal amount) {
public record Transaction(
    String id,
    LocalDateTime timestamp,
    TransactionType type,
    TransactionCategory category,
    BigDecimal amount,
    Optional<String> notes) {
  // TODO: Set the scale for amount to 2 decimal places
  public static Transaction from(TransactionDTO transaction) {
    String id = UUID.randomUUID().toString();
    LocalDateTime timestamp = LocalDateTime.now();

    return new Transaction(
        id,
        timestamp,
        transaction.type(),
        transaction.category(),
        transaction.amount(),
        Optional.ofNullable(transaction.notes()));
  }
}
