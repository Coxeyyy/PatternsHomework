package com.coxey.app.exercise3.commands;

import com.coxey.app.exercise3.receiver.Notification;

public class NotificationSMS implements Command {
    private Notification notification;

    public NotificationSMS(Notification notification) {
        this.notification = notification;
    }
    @Override
    public void execute() {
        notification.notificationSMS();
    }
}
