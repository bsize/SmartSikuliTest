package app.page_object.menu;

import app.page_object.forms.SideBarForm;
import org.openqa.selenium.By;
import web_driver.elements.Button;
import web_driver.entity.BaseForm;

public class SideBarMenu extends BaseForm {

    private static By formLocator = By.xpath("//ul[contains(@class,'sidebar-tabs tabs not-always use-visibility')]");
    private static String formTitle = "Side-Bar menu";
    private Button btnElementSideBarMenu;
    private SideBarForm sideBarForm = new SideBarForm();

    public SideBarMenu() {
        super(formLocator, formTitle);
    }

    public SideBarForm getSideBarForm() {
        return sideBarForm;
    }

    public void btnElementSideBarMenu(String name){
        btnElementSideBarMenu = new Button(By.xpath(String.format("//a[contains(@title,'%s')]", name)), name);
        btnElementSideBarMenu.clickWithExecutor();
    }
}
