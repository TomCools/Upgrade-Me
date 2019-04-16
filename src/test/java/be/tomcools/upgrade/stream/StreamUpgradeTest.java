package be.tomcools.upgrade.stream;

import be.tomcools.upgrade.stream.log.LogMessage;
import org.junit.Test;

import java.util.List;

public class StreamUpgradeTest {

    @Test
    public void fromFirstWarning() {
        List<LogMessage> logMessages = StreamsUpgrade.logMessages();

        //asserThat()
    }

    @Test
    public void untilBeforeFirstError() {
        List<LogMessage> logMessages = StreamsUpgrade.logMessages();
    }

    @Test
    public void untilFirstError() {
        List<LogMessage> logMessages = StreamsUpgrade.logMessages();
    }

    @Test
    public void fromFirstWarningToFollowingError() {
        // and ends with the first following error
        List<LogMessage> logMessages = StreamsUpgrade.logMessages();

    }
}
