package com.coxey.app.exercise3.commands;

import com.coxey.app.exercise3.receiver.Notification;

public class NotificationEMail implements Command {
    private Notification notification;

    public NotificationEMail(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void execute() {
        notification.notificationEMail();
        notification.notificationSMSWithEMail();
    }
}
