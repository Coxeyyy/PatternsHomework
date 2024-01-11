package com.coxey.app.exercise3.invoker;

import com.coxey.app.exercise3.commands.Command;

public class NotificationControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sendNotification() {
        command.execute();
    }
}
