package app.page_object.pages;

import app.page_object.forms.ProductPropertiesForm;
import app.page_object.forms.ScenePropertiesForm;
import app.page_object.forms.WelcomeToRoomForm;
import app.page_object.forms.WorkSpaceForm;
import app.page_object.menu.SideBarMenu;
import org.openqa.selenium.By;
import web_driver.entity.BaseForm;

public class MainPage extends BaseForm{

    private static By formLocator = By.xpath("//div[@id='view-menu']");
    private static String formTitle = "Main form";
    private WelcomeToRoomForm welcomeToRoomStylerForm = new WelcomeToRoomForm();
    private WorkSpaceForm workSpaceForm = new WorkSpaceForm();
    private SideBarMenu sideBarMenu = new SideBarMenu();
    private ProductPropertiesForm productPropertiesForm = new ProductPropertiesForm();
    private ScenePropertiesForm scenePropertiesForm = new ScenePropertiesForm();

    public MainPage() {
        super(formLocator, formTitle);
    }

    public SideBarMenu getSideBarMenu() {
        return sideBarMenu;
    }

    public WelcomeToRoomForm getWelcomeToRoomStylerForm() {
        return welcomeToRoomStylerForm;
    }

    public WorkSpaceForm getWorkSpaceForm() {
        return workSpaceForm;
    }

    public ProductPropertiesForm getProductPropertiesForm() {
        return productPropertiesForm;
    }

    public ScenePropertiesForm getScenePropertiesForm() {
        return scenePropertiesForm;
    }
}
