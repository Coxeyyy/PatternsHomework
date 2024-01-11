package com.coxey.app.exercise3.receiver;

public class Notification {
    public void notificationSMS() {
        System.out.println("Ссылка на скачивание анкеты www.example.com");
    }

    public void notificationSMSWithEMail() {
        System.out.println("Вам пришло EMail-сообщение со ссылкой для скачивания анкеты");
    }

    public void notificationEMail() {
        System.out.println("Ваша анкета -> form.pdf");
    }
}
