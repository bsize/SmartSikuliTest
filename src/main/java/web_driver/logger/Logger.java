package web_driver.logger;

public class Logger {

    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Logger.class);
    private static Logger instance = null;
    private static boolean logSteps = true;

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void info(final String message) {
        logger.info(message);
    }

    public void fatal(final String message) {
        logger.info(message);
    }

    public void logDelim(){
        info("------------------------------");
    }

    public void warn(final String message) {
        logger.warn(message);
    }

    public void error(final String message) {
        logger.error(message);
    }

    public void logTestName(final String testName) {
        if (logSteps) {
            String formattedName = String.format("=====  Test case: '%s' =====", testName);

            String delims = "";
            int nChars = formattedName.length();
            for (int i = 0; i < nChars; i++) {
                delims += "-";
            }
            info(delims);
            info(formattedName);
            info(delims);
        }
    }

    public void step(String numberOfStep, String text) {
        info(numberOfStep + ", " + text);
    }
}