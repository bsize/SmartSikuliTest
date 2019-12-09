package web_driver.entity;

import org.openqa.selenium.By;
import web_driver.elements.FormElement;
import web_driver.logger.Logger;

public abstract class BaseForm {

    protected By titleLocator;
    protected String title;
    private FormElement formElement;
    protected static Logger logger = Logger.getInstance();

    protected BaseForm(final By locator, final String formTitle) {
        titleLocator = locator;
        title = formTitle;
        formElement = new FormElement(locator, title);

    }

    public boolean currentForm() {
        logger.info("Current form is - " + title);
        return formElement.isFormPresent();
    }
}
