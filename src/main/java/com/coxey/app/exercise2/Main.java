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
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
        boolean creditHistory = server.getClientCreditHistory("Petrov Ivan Sidorovich", 20, "89005001212", 220_000);
        Client client = new Client("Petrov Ivan Sidorovich", 20, "89005001212", 220_000, creditHistory);
        Credit credit = new Credit(1_600_000, 20, 48, 26_000);
        server.sendRequest(client, credit);
    }
}
