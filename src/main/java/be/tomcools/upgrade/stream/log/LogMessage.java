package be.tomcools.upgrade.stream.log;

import static be.tomcools.upgrade.stream.log.Priority.*;
import static java.util.Objects.requireNonNull;

public class LogMessage {

    final String message;
    final Priority priority;

    private LogMessage(String message, Priority priority) {
        this.message = requireNonNull(message);
        this.priority = priority;
    }

    public static LogMessage info(String message) {
        return new LogMessage(message, INFO);
    }

    public static LogMessage warning(String message) {
        return new LogMessage(message, WARNING);
    }

    public static LogMessage error(String message) {
        return new LogMessage(message, ERROR);
    }

    @Override
    public String toString() {
        return "{" + message + ", " + priority + "}";
    }
}
