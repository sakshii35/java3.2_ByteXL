package com.example.bankapp.dao;

import com.example.bankapp.entity.Account;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Account findById(int id) {
        return entityManager.find(Account.class, id);
    }

    public void update(Account account) {
        entityManager.merge(account);
    }
}
