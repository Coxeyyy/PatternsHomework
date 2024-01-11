package com.coxey.app.exercise2.middleware;

import com.coxey.app.exercise2.essence.Client;
import com.coxey.app.exercise2.essence.Credit;

public class RequestMiddleware extends Middleware {
    /**
     * Метод который делает проверку правильности подачи заявки
     */
    @Override
    public boolean check(Client client, Credit credit) {
        if(client.getFullName() == null || client.getFullName().equals("") ||
           client.getAge() < 18 || client.getPhoneNumber() == null ||
           client.getIncomePerMonth() < 50_000 || client.isCreditHistory() != true) {
            System.out.println("Ваши данные невалидны!");
            return false;
        }
        if(credit.getCreditAmount() < 500_000 || credit.getCreditAmount() > 1_000_000 ||
           credit.getInterestRate() < 15.0 || credit.getCreditPeriod() < 36 ||
           credit.getMonthlyPayment() < 25500) {
            System.out.println("Ваша кредитный запрос отклонен");
            return false;
        }
        return checkNext(client, credit);
    }
}
