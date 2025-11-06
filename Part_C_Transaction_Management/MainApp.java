package com.example.bankapp;

import com.example.bankapp.config.AppConfig;
import com.example.bankapp.service.BankService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BankService service = context.getBean(BankService.class);

        // Transfer Rs.500 from Account 101 to 102
        service.transferMoney(101, 102, 500);

        context.close();
    }
}
