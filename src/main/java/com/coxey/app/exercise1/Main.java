package com.coxey.app.exercise1;

import com.coxey.app.exercise1.factory.CreatorCard;
import com.coxey.app.exercise1.factory.CreatorCreditCard;
import com.coxey.app.exercise1.factory.CreatorDebitCard;

import java.util.Scanner;

public class Main {
    private static CreatorCard creatorCard;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите какую карту хотите создать 1 - кредитную или 2 - дебетовую: ");
        int cardType = Integer.parseInt(scanner.next());
        switch(cardType) {
            case (1):
                creatorCard = new CreatorCreditCard();
                break;
            case (2):
                creatorCard = new CreatorDebitCard();
                break;
            default:
                throw new RuntimeException("Карты такого типа не существует");
        }
        boolean flag = true;
        while(flag) {
            System.out.println("Список действий с картой, для выхода введите 0");
            System.out.println("1 - проверить баланс карты");
            System.out.println("2 - пополнить баланс карты");
            System.out.println("3 - снять деньги с карты");
            System.out.print("Введите цифру для действия: ");
            int digitSelection = Integer.parseInt(scanner.next());
            switch(digitSelection) {
                case (0):
                    flag = false;
                    break;
                case (1):
                    creatorCard.checkBalanceCard();
                    System.out.println();
                    break;
                case (2):
                    System.out.print("Введите сумму на которую хотите пополнить карту: ");
                    double valueIncrease = Double.parseDouble(scanner.next());
                    creatorCard.increaseCardBalance(valueIncrease);
                    System.out.println();
                    break;
                case (3):
                    System.out.print("Введите сумму которую хотите снять с карты: ");
                    double valueDecrease = Double.parseDouble(scanner.next());
                    creatorCard.decreaseCardBalance(valueDecrease);
                    System.out.println();
                    break;
                default:
                    System.out.println("Такого действия не существует");
                    System.out.println();
                    break;
            }
        }
    }
}
