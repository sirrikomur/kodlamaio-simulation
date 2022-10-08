package core.logging.loggers.base;

import core.domain.Entity;

public abstract class LoggerService implements Logger {
    @Override
    public abstract void log(String message);
}
