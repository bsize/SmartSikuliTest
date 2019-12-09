package app.page_object.forms;

import app.models.ItemDimensionsModel;
import app.utils.DimensionsProperties;
import org.openqa.selenium.By;
import web_driver.elements.Label;
import web_driver.entity.BaseForm;

public class ProductPropertiesForm extends BaseForm {

    private static By formLocator = By.xpath("//a[contains(text(), 'Product information')]");
    private static String formTitle = "Product information menu";
    private Label lblProductInformation = new Label(By.xpath("//p[contains(@class, 'dimensions')]"), "Product dimensions");

    public ProductPropertiesForm() {
        super(formLocator, formTitle);
    }

    public ItemDimensionsModel createModel() {
        DimensionsProperties.lblDimensionsInfo(lblProductInformation.getText());
        return new ItemDimensionsModel(DimensionsProperties.getHeight(), DimensionsProperties.getWidth(), DimensionsProperties.getLength());
    }
}
