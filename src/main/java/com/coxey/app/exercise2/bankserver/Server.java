package com.coxey.app.exercise2.bankserver;

import com.coxey.app.exercise2.essence.Client;
import com.coxey.app.exercise2.essence.Credit;
import com.coxey.app.exercise2.middleware.Middleware;

import java.util.Random;

public class Server {
    private final Random random = new Random();
    private Middleware middleware;

    public boolean sendRequest(Client client, Credit credit) {
        if(middleware.check(client, credit)) {
            System.out.println("Успешно! Вам выдан кредит на сумму " + credit.getCreditAmount());
            return true;
        }
        return false;
    }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean complianceCheck() {
        int complianceValue = random.nextInt(10) + 1;
        if(complianceValue >= 9) {
            return false;
        }
        return true;
    }

    public boolean getClientCreditHistory(String fullName, int age, String phoneNumber, double incomePerMonth) {
        int creditHistory = random.nextInt(10) + 1;
        if(creditHistory > 9) {
            return false;
        }
        return true;
    }
}
