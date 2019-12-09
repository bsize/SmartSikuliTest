package app.page_object.forms;

import org.openqa.selenium.By;
import web_driver.elements.Button;
import web_driver.entity.BaseForm;

public class WelcomeToRoomForm extends BaseForm {

    private static By formLocator = By.xpath("//div[contains(@id, 'welcome-popup')]");
    private static String formTitle = "Welcome form";
    private Button btnCloseForm =
            new Button(By.xpath("//a[contains(@class,'popin-close-title')]"), "Close Welcome form");

    public WelcomeToRoomForm() {
        super(formLocator, formTitle);
    }

    public void btnCloseFormClick() {
        btnCloseForm.click();
    }
}
