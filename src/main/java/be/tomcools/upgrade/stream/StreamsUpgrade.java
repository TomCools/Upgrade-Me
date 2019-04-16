package be.tomcools.upgrade.stream;

import be.tomcools.upgrade.stream.log.LogMessage;

import java.util.List;

public class StreamsUpgrade {

    public static List<LogMessage> logMessages() {
        return List.of(
                LogMessage.info("Starting"),
                LogMessage.info("Started"),
                LogMessage.warning("High Temperature Detected"),
                LogMessage.error("Overheated"),
                LogMessage.info("Shutdown initiated"));
    }
}
