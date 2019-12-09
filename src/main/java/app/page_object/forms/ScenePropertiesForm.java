package app.page_object.forms;

import app.models.ItemPropertiesModel;
import org.openqa.selenium.By;
import web_driver.elements.Label;
import web_driver.entity.BaseForm;

public class ScenePropertiesForm extends BaseForm {

    private static By formLocator = By.xpath("//a[contains(text(), 'Scene information')]");
    private static String formTitle = "Scene properties menu";
    private static String lblFormat =  "//div[contains(@class, 'scene')]//b[contains(@class, '%s')]";
    private Label lblWalls = new Label(By.xpath(String.format(lblFormat, "wallsCount")), "Walls");
    private Label lblDoors = new Label(By.xpath(String.format(lblFormat, "doorsCount")), "Doors");
    private Label lblWindows = new Label(By.xpath(String.format(lblFormat, "windowsCount")), "Windows");
    private Label lblProducts = new Label(By.xpath(String.format(lblFormat, "componentsCount")), "Products");
    private Label lblMaterials = new Label(By.xpath(String.format(lblFormat, "materialsCount")), "Materials");

    public ScenePropertiesForm() {
        super(formLocator, formTitle);
    }

    public ItemPropertiesModel createModel() {
        return new ItemPropertiesModel(
                lblGetText(lblWalls),
                lblGetText(lblDoors),
                lblGetText(lblWindows),
                lblGetText(lblProducts),
                lblGetText(lblMaterials));
    }

    public int lblGetText(Label label){
        return Integer.parseInt(label.getText());
    }
}
