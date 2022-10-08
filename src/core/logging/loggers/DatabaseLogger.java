package core.logging.loggers;

import core.domain.Entity;
import core.logging.loggers.base.LoggerService;

public class DatabaseLogger extends LoggerService {
    @Override
    public void log(String message) {
        System.out.println("Logged to database.\nMessage: " + message);
    }
}
