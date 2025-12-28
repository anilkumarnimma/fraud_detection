package com.anil.fraud_detection.controller;

import com.anil.fraud_detection.model.Transaction;
import com.anil.fraud_detection.service.FraudCheckService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fraud")
public class TransactionController {

    private final FraudCheckService service;

    public TransactionController(FraudCheckService service) {
        this.service = service;
    }

    @PostMapping("/check")
    public Transaction check(@RequestBody Transaction tx) {
        return service.check(tx);
    }

    @GetMapping("/ping")
    public String ping() {
        return "FraudShield is up";
    }
}
