package com.coxey.app.exercise3.commands;

import com.coxey.app.exercise3.receiver.Notification;

public class NotificationEmailSMS implements Command {
    private Notification notification;

    public NotificationEmailSMS(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void execute() {
        notification.notificationSMS();
        notification.notificationEMail();
        notification.notificationSMSWithEMail();
    }
}
