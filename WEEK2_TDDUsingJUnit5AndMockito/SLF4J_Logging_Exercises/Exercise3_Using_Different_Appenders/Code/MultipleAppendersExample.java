import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultipleAppendersExample {
    private static final Logger logger = LoggerFactory.getLogger(MultipleAppendersExample.class);

    public static void main(String[] args) {
        logger.info("This message should appear in both console and file");
        logger.warn("Warning: Disk space is low");
        logger.error("Error: Could not connect to database");
        logger.debug("Debug: This is a debug-level message");
    }
}
