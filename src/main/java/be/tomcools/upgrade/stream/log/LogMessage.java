package be.tomcools.upgrade.stream.log;

import static be.tomcools.upgrade.stream.log.Priority.*;
import static java.util.Objects.requireNonNull;

public class LogMessage {

   private final String message;
   private final Priority priority;

    private LogMessage(String message, Priority priority) {
        this.message = requireNonNull(message);
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public Priority getPriority() {
        return priority;
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
