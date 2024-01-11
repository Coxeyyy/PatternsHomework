package com.coxey.app.exercise2;

import com.coxey.app.exercise2.bankserver.Server;
import com.coxey.app.exercise2.essence.Client;
import com.coxey.app.exercise2.essence.Credit;
import com.coxey.app.exercise2.middleware.ComplianceMiddleware;
import com.coxey.app.exercise2.middleware.DecisionCreditMiddleware;
import com.coxey.app.exercise2.middleware.Middleware;
import com.coxey.app.exercise2.middleware.RequestMiddleware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void startDemo() {
        server = new Server();
        Middleware middleware = Middleware.link(
                new RequestMiddleware(),
                new ComplianceMiddleware(server),
                new DecisionCreditMiddleware()
        );
        server.setMiddleware(middleware);
    }
    public static void main(String[] args) throws IOException {
        startDemo();
        boolean success = true;
        do {
            System.out.print("Введите ФИО: ");
            String fullName = reader.readLine();
            System.out.print("Введите возраст: ");
            int age = Integer.parseInt(reader.readLine());
            System.out.print("Введите номер телефона: ");
            String phoneNumber = reader.readLine();
            System.out.print("Введите Ваш месячный заработок: ");
            double incomePerMonth = Double.parseDouble(reader.readLine());
            boolean creditHistory = server.getClientCreditHistory(fullName, age, phoneNumber, incomePerMonth);
            System.out.print("Введите сумму кредита: ");
            int creditAmount = Integer.parseInt(reader.readLine());
            System.out.print("Введите процентную ставку: ");
            double interestRate = Double.parseDouble(reader.readLine());
            System.out.print("Введите срок кредита: ");
            int creditPeriod = Integer.parseInt(reader.readLine());
            System.out.print("Введите ежемесячный платеж: ");
            double monthlyPayment = Double.parseDouble(reader.readLine());
            Client client = new Client(fullName, age, phoneNumber, incomePerMonth, creditHistory);
            Credit credit = new Credit(creditAmount, interestRate, creditPeriod, monthlyPayment);
            success = server.sendRequest(client, credit);
        } while(!success);
    }
}
