package com.fadedblack.money_tracker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class TransactionsController {

    @GetMapping
    public ResponseEntity<String> getTransactions() {
        return ResponseEntity.ok("List of transactions");
    }

    @PostMapping("/add")
    public ResponseEntity<String> addTransaction() {
        return ResponseEntity.status(201).body("Transaction added");
    }
}
