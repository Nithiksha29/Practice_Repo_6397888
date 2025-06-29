import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

 class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String userName = "Alice";
        int userAge = 30;

        logger.info("User {} has logged in", userName);
        logger.warn("User {} is {} years old and attempting access to a restricted area", userName, userAge);

        int items = 5;
        double price = 10.75;

        logger.debug("Processing order: {} items at ${} each", items, price);
    }
}
