package com.coxey.app.exercise2.middleware;

import com.coxey.app.exercise2.essence.Client;
import com.coxey.app.exercise2.essence.Credit;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for(Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(Client client, Credit credit);
    protected boolean checkNext(Client client, Credit credit) {
        if(next == null) {
            return true;
        }
        return next.check(client, credit);
    }
}
