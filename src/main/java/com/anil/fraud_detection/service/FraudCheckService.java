package com.anil.fraud_detection.service;

import com.anil.fraud_detection.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class FraudCheckService {

    public Transaction check(Transaction tx) {
        double amount = tx.getAmount();

        if (amount <= 0) {
            tx.setFraud(true);
            return tx;
        }

        if (amount > 10000) {
            tx.setFraud(true);
            return tx;
        }

        tx.setFraud(false);
        return tx;
    }
}
