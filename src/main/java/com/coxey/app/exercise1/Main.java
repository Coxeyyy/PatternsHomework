package com.coxey.app.exercise1;

import com.coxey.app.exercise1.factory.CreatorCard;
import com.coxey.app.exercise1.factory.CreatorCreditCard;
import com.coxey.app.exercise1.factory.CreatorDebitCard;

import java.util.Scanner;

public class Main {
    private static CreatorCard creatorCard;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите какую карту хотите создать: Credit или Debit: ");
        String cardType = scanner.next();
        switch(cardType) {
            case("Credit"):
                creatorCard = new CreatorCreditCard();
                break;
            case("Debit"):
                creatorCard = new CreatorDebitCard();
                break;
            default:
                throw new RuntimeException("Карты такого типа не существует");
        }
        creatorCard.checkBalanceCard();
    }
}
