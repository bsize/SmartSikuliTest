package web_driver.elements;

import org.openqa.selenium.By;
import web_driver.entity.BaseElement;
import web_driver.logger.Logger;

public class TextBox extends BaseElement {

    private static Logger logger = Logger.getInstance();

    public TextBox(By locator, String name) {
        super(locator, name);
    }

    public void sendKeys(String key) {
        waitForIsElementPresent();
        getElement().sendKeys(key);
        logger.info(String.format("Set value '%s' in field '%s'", key, name));
    }
}