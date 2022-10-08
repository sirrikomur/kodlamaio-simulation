package core.logging;

import core.logging.loggers.base.LoggerService;

import java.util.List;

public class LogManager implements LogService {
    private final List<LoggerService> _loggerServices;

    public LogManager(List<LoggerService> loggerServices) {
        _loggerServices = loggerServices;
    }

    @Override
    public void log(String message) {
        for (LoggerService loggerService : _loggerServices) {
            loggerService.log(message);
        }
    }
}
