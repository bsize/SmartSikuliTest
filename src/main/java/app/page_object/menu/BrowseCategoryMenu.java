package app.page_object.menu;

import org.openqa.selenium.By;
import web_driver.elements.Button;
import web_driver.entity.BaseForm;

public class BrowseCategoryMenu extends BaseForm {

    private static By formLocator = By.xpath("//div[contains(@class,'facet-category')]//h1");
    private static String formTitle = "Browse categories menu";
    private Button btnBrowseCategory;

    public BrowseCategoryMenu() {
        super(formLocator, formTitle);
    }

    public void btnBrowseCategoryClick(String name){
        btnBrowseCategory = new Button(By.xpath(String.format("//a[contains(text(),'%s')]", name)),name);
        btnBrowseCategory.click();
    }
}
