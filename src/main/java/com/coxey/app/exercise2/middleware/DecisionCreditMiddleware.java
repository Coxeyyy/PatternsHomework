package com.coxey.app.exercise2.middleware;

import com.coxey.app.exercise2.essence.Client;
import com.coxey.app.exercise2.essence.Credit;

public class DecisionCreditMiddleware extends Middleware {
    /**
     * Метод проверяет, если клиент получает меньше 50_000 в месяц
     * то он прерывает проверку и выдает отказ от предоставления кредита
     */
    @Override
    public boolean check(Client client, Credit credit) {
        if(client.getIncomePerMonth() < 50_000) {
            System.out.println("Кредит отклонен");
            return false;
        }
        return checkNext(client, credit);
    }
}
