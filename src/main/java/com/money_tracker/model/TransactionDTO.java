package com.money_tracker.model;

import java.math.BigDecimal;

public record TransactionDTO(
    TransactionType type, TransactionCategory category, BigDecimal amount, String notes) {}
