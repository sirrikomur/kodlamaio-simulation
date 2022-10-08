package core.logging.loggers;

import core.logging.loggers.base.LoggerService;

public class MailLogger extends LoggerService {
    @Override
    public void log(String message) {
        System.out.println("Logged to mail.\nMessage: " + message);
    }
}
