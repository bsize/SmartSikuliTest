package app.page_object.forms;

import app.page_object.menu.BrowseCategoryMenu;
import org.openqa.selenium.By;
import web_driver.entity.BaseForm;

public class SideBarForm extends BaseForm {

    private static By formLocator = By.xpath("//div[contains(@class,'facet-category')]//h1");
    private static String formTitle = "Side-Bar form";
    private BrowseCategoryMenu browseCategoryMenu = new BrowseCategoryMenu();
    private ItemsForm itemsForm = new ItemsForm();

    public BrowseCategoryMenu getBrowseCategoryMenu() {
        return browseCategoryMenu;
    }

    public ItemsForm getItemsForm() {
        return itemsForm;
    }

    public SideBarForm() {
        super(formLocator, formTitle);
    }
}
