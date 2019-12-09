package app.page_object.forms;

import org.openqa.selenium.By;
import web_driver.entity.BaseForm;
import web_driver.utils.SikuliUtils;

public class ItemsForm extends BaseForm {

    public ItemsForm() {
        super(formLocator, formTitle);
    }

    private static By formLocator = By.xpath("//div[contains(@class, 'sidebar-pane sidebar-build-container')]");
    private static String formTitle = "Items form";


    public void moveItemToWorkSpace(String itemInMenu, String partOfWorkSpacePicture) {
        SikuliUtils.dragAndDrop(itemInMenu, partOfWorkSpacePicture);
    }
}
