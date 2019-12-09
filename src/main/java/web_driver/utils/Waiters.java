package web_driver.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import web_driver.Browser;
import web_driver.logger.Logger;

public class Waiters {

    private static final int TIMEOUT_FOR_CONDITIONS = Browser.getTimeoutForCondition();
    private static final Long TIMEOUT_FOR_PAGE_LOAD = Long.parseLong(Browser.getTimeoutForPageLoad());
    private static Logger logger = Logger.getInstance();


    public static void waitToBeClickable(By locator, String name) {
        try {
            logger.info(String.format("Wait until button '%s' to be clickable", name));
            WebDriverWait wait = new WebDriverWait(Browser.getInstance().getDriver(), TIMEOUT_FOR_CONDITIONS);
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (TimeoutException e) {
            logger.warn(String.format("Button isn't clickable in '%s' seconds",  TIMEOUT_FOR_CONDITIONS));
        }
    }

    public static void waitToBePresented(By locator) {
        try {
            logger.info("Wait until element to be presented");
            WebDriverWait wait = new WebDriverWait(Browser.getInstance().getDriver(), TIMEOUT_FOR_CONDITIONS);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (TimeoutException e) {
            logger.warn(String.format("Element isn't present in '%s' seconds",  TIMEOUT_FOR_CONDITIONS));
        }
    }

    public static void waitToBeVisible(WebElement element) {
        try {
            logger.info("Wait until element to be visible");
            WebDriverWait wait = new WebDriverWait(Browser.getInstance().getDriver(), TIMEOUT_FOR_CONDITIONS);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            logger.warn(String.format("Element isn't visible in '%s' seconds",  TIMEOUT_FOR_CONDITIONS));
        }
    }

    public static void waitToBeVisibleElementLocated(By locator, int waitTime) {
        try {
            logger.info("Wait until element to be visible");
            new WebDriverWait(Browser.getInstance().getDriver(), waitTime).
                    until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            logger.warn(String.format("Element isn't visible in '%s' seconds",  waitTime));
        }
    }

    public static void waitToBeInVisibleElementLocated(By locator, int waitTime) {
        try {
            logger.info("Wait until element to be invisible");
            new WebDriverWait(Browser.getInstance().getDriver(), waitTime).
                    until(ExpectedConditions.invisibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            logger.warn(String.format("Element is visible in '%s' seconds",  waitTime));
        }
    }

    public static void waitElement() {
        try {
            logger.info("Wait until element to be presented");
            (new WebDriverWait(Browser.getInstance().getDriver(), TIMEOUT_FOR_CONDITIONS)).until((element) -> false);
        } catch (TimeoutException e) {
            logger.warn("Element isn't present");
        }
    }

    public static void waitForPageToLoad() {
        logger.info("Wait until for page to load");
        WebDriverWait wait = new WebDriverWait(Browser.getInstance().getDriver(), TIMEOUT_FOR_PAGE_LOAD);
        try {
            wait.until(d -> {
                if (!(d instanceof JavascriptExecutor)) {
                    return true;
                }
                Object result = ((JavascriptExecutor) d)
                        .executeScript("return document['readyState'] ? 'complete' == document.readyState : true");
                if (result != null && result instanceof Boolean && (Boolean) result) {
                    return true;
                }
                return false;
            });
        } catch (Exception e) {
            logger.error("Page loading timed out");
        }
    }
}
