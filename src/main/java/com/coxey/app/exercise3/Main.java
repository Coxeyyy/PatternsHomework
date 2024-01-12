package com.coxey.app.exercise3;

import com.coxey.app.exercise3.commands.Command;
import com.coxey.app.exercise3.commands.NotificationEMail;
import com.coxey.app.exercise3.commands.NotificationEmailSMS;
import com.coxey.app.exercise3.commands.NotificationSMS;
import com.coxey.app.exercise3.exception.NotificationException;
import com.coxey.app.exercise3.invoker.NotificationControl;
import com.coxey.app.exercise3.receiver.Notification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        Command notificationEMail = new NotificationEMail(notification);
        Command notificationSMS = new NotificationSMS(notification);
        Command notificationEMailSMS = new NotificationEmailSMS(notification);
        NotificationControl notificationControl = new NotificationControl();
        System.out.println("Выберите тип уведомления");
        System.out.println("Введите 1 , чтобы отправить уведомление по SMS");
        System.out.println("Введите 2 , чтобы отправить уведомление по EMail");
        System.out.println("Введите 3 , чтобы отправить уведомление по SMS и EMail");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру для выбора типа уведомления: ");
        String textFromClient = scanner.next();
        switch(textFromClient) {
            case "1":
                notificationControl.setCommand(notificationSMS);
                notificationControl.sendNotification();
                break;
            case "2":
                notificationControl.setCommand(notificationEMail);
                notificationControl.sendNotification();
                break;
            case "3":
                notificationControl.setCommand(notificationEMailSMS);
                notificationControl.sendNotification();
                break;
            default:
                throw new NotificationException("Такого уведомления нет");
        }
    }
}
