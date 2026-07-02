package com.money_tracker.model;

import com.money_tracker.constant.TransactionCategory;
import com.money_tracker.constant.TransactionType;
import java.math.BigDecimal;

public record TransactionDTO(
        TransactionType type, TransactionCategory category, BigDecimal amount, String notes) {}
