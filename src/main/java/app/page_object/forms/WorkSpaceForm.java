package app.page_object.forms;

import org.openqa.selenium.By;
import web_driver.entity.BaseForm;
import web_driver.utils.SikuliUtils;

public class WorkSpaceForm extends BaseForm {

    private static By formLocator = By.xpath("//div[@id='view-isometric']//div[contains(@class,'view')]");
    private static String formTitle = "Work space form";
    private static String nameOfButton = "Close";

    public WorkSpaceForm() {
        super(formLocator, formTitle);
    }

    public void referencePictureIsPresent(String path) {
        SikuliUtils.isPresent(path);
    }

    public void itemClick(String path) {
        SikuliUtils.itemClick(path);
    }

    public void btnCloseItemClick(String path) {
        SikuliUtils.click(path, nameOfButton);
    }

    public void itemPictureIsNotPresent(String path){
        SikuliUtils.isPresent(path);
    }
}
