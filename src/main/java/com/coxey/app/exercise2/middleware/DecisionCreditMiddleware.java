package com.coxey.app.exercise2.middleware;

import com.coxey.app.exercise2.essence.Client;
import com.coxey.app.exercise2.essence.Credit;

public class DecisionCreditMiddleware extends Middleware {
    @Override
    public boolean check(Client client, Credit credit) {
        if(client.getIncomePerMonth() < 50_000) {
            System.out.println("Кредит отклонен");
            return false;
        }
        return checkNext(client, credit);
    }
}
