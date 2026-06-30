package com.money_tracker.service;

import com.money_tracker.model.Transaction;
import com.money_tracker.model.TransactionDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TransactionService {

    private List<Transaction> transactions;

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(TransactionDTO transaction) {
        transactions.add(Transaction.from(transaction));
    }
}
