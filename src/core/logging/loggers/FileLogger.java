package core.logging.loggers;

import core.logging.loggers.base.LoggerService;

public class FileLogger extends LoggerService {
    @Override
    public void log(String message) {
        System.out.println("Logged to file.\nMessage: " + message);
    }
}
