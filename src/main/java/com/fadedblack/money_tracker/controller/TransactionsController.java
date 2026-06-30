package com.fadedblack.money_tracker.controller;

import com.fadedblack.money_tracker.model.Transaction;
import com.fadedblack.money_tracker.model.TransactionDTO;
import com.fadedblack.money_tracker.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/transactions")
public class TransactionsController {

    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>> getTransactions() {
        return ResponseEntity.ok(transactionService.getTransactions());
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addTransaction(@RequestBody TransactionDTO transaction) {
        log.debug("Transaction add request: {}", transaction);
        transactionService.addTransaction(transaction);
        return ResponseEntity.status(201).build();
    }
}
