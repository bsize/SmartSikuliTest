package web_driver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import web_driver.Browser;
import web_driver.logger.Logger;

import java.util.List;

public class FormElement {
    private WebDriver driver = Browser.getInstance().getDriver();
    private static Logger logger = Logger.getInstance();
    private By locator;
    private String name;

    public FormElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    private List<WebElement> findElements(){
        return driver.findElements(locator);
    }

    public boolean isFormPresent(){
        return findElements().size() > 0;
    }
}
