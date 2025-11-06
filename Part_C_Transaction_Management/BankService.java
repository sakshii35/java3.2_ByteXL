package com.example.bankapp.service;

import com.example.bankapp.dao.AccountDAO;
import com.example.bankapp.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

    @Autowired
    private AccountDAO accountDAO;

    @Transactional
    public void transferMoney(int fromAccId, int toAccId, double amount) {
        Account from = accountDAO.findById(fromAccId);
        Account to = accountDAO.findById(toAccId);

        if (from.getBalance() < amount) {
            throw new RuntimeException("Insufficient balance!");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        accountDAO.update(from);
        accountDAO.update(to);

        System.out.println("Transaction Successful!");
    }
}
