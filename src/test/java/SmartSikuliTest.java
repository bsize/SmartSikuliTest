
import app.models.ProductItemModel;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import web_driver.utils.PropertiesReader;

public class SmartSikuliTest extends BaseEntity {

    @Parameters({"itemInMenu", "closeItemPicture", "partOfWorkSpacePicture", "referencePicture", "cleanArea", "expectedResult"})
    @Test
    public void SmartSikuliTest(String itemInMenu, String closeItemPicture, String partOfWorkSpacePicture, String referencePicture, String cleanArea, String expectedResult) {

        ProductItemModel item = new ProductItemModel(itemInMenu, PropertiesReader.getTestProps("pathForPicture"), referencePicture);

        logger.step("Step 1", "Open main page");
        steps.openMainPage();
        logger.logDelim();

        logger.step("Step 2", "Close 'Welcome to roomstyler 3D home planner' tab");
        steps.btnCloseFormClick();
        logger.logDelim();

        logger.step("Step 3", "Open 'Furnish your room' menu");
        steps.btnFurnishYourRoomClick();
        logger.logDelim();

        logger.step("Step 4", "Go to the 'Dining room'");
        steps.btnBrowseCategoryClick();
        logger.logDelim();

        logger.step("Step 5", "Select item and move to the workspace");
        steps.dragAndDropItem(item.getItemInMenu(), item.getPathForPicture() + partOfWorkSpacePicture);
        logger.logDelim();

        logger.step("Step 6", "Check that item is displayed correctly in the workspace");
        steps.referencePictureIsPresent(item.getReferencePicture());
        logger.logDelim();

        logger.step("Step 7", "Click on item and check data");
        steps.itemClick(item.getReferencePicture());
        steps.checkDimensions(expectedResult);
        logger.logDelim();

        logger.step("Step 8", "Delete item");
        steps.btnCloseItemClick(item.getPathForPicture() + closeItemPicture);
        steps.checkSceneProperties(item.getPathForPicture() + cleanArea, expectedResult);
        logger.logDelim();
    }
}
