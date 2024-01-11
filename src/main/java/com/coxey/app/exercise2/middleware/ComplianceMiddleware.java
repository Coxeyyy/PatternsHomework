package com.coxey.app.exercise2.middleware;

import com.coxey.app.exercise2.essence.Client;
import com.coxey.app.exercise2.essence.Credit;
import com.coxey.app.exercise2.bankserver.Server;

public class ComplianceMiddleware extends Middleware {
    private final Server server;

    public ComplianceMiddleware(Server server) {
        this.server = server;
    }

    /**
     * Метод получает от сервера информацию прошел ли клиент комплаенс проверку
     */
    @Override
    public boolean check(Client client, Credit credit) {
        if(!server.complianceCheck()) {
            System.out.println("Вы не прошли комплаенс");
            return false;
        }
        return checkNext(client, credit);
    }
}
