package app.steps;

import app.models.ItemDimensionsModel;
import app.models.ItemPropertiesModel;
import app.page_object.pages.MainPage;
import app.page_object.menu.enums.BrowseCategoriesEnum;
import app.page_object.menu.enums.SideBarEnum;
import org.assertj.core.api.SoftAssertions;
import web_driver.asserts.AssertForm;

public class Steps {

    private static MainPage mainPage;
    private SideBarEnum sideBarEnum;
    private BrowseCategoriesEnum browseCategoriesEnum;
    private SoftAssertions softAssertions;

    public void openMainPage(){
        mainPage = new MainPage();
        AssertForm.assertForCurrentForm(mainPage);
    }

    public void btnCloseFormClick() {
        AssertForm.assertForCurrentForm(mainPage.getWelcomeToRoomStylerForm());
        mainPage.getWelcomeToRoomStylerForm().btnCloseFormClick();
    }

    public void btnFurnishYourRoomClick() {
        AssertForm.assertForCurrentForm(mainPage.getSideBarMenu());
        mainPage.getSideBarMenu().btnElementSideBarMenu(sideBarEnum.FURNISH.getValue());
    }

    public void btnBrowseCategoryClick() {
        AssertForm.assertForCurrentForm(mainPage.getSideBarMenu().getSideBarForm().getBrowseCategoryMenu());
        mainPage.getSideBarMenu().getSideBarForm().getBrowseCategoryMenu().btnBrowseCategoryClick(browseCategoriesEnum.DINING_ROOM.getValue());
    }

    public void dragAndDropItem(String itemInMenu, String partOfWorkSpacePicture) {
       mainPage.getSideBarMenu().getSideBarForm().getItemsForm().moveItemToWorkSpace(itemInMenu, partOfWorkSpacePicture);
    }

    public void referencePictureIsPresent(String path) {
       AssertForm.assertForCurrentForm(mainPage.getWorkSpaceForm());
       mainPage.getWorkSpaceForm().referencePictureIsPresent(path);
    }

    public void itemClick(String path) {
        mainPage.getWorkSpaceForm().itemClick(path);
    }

    public void checkDimensions(String expectedResult) {
        AssertForm.assertForCurrentForm(mainPage.getProductPropertiesForm());
        int expectedRequiredResult = Integer.parseInt(expectedResult);
        mainPage.getProductPropertiesForm().createModel();
        softAssertions = new SoftAssertions();
        softAssertions.assertThat(ItemDimensionsModel.getHeight()).isNotEqualTo(expectedRequiredResult);
        softAssertions.assertThat(ItemDimensionsModel.getLength()).isNotEqualTo(expectedRequiredResult);
        softAssertions.assertThat(ItemDimensionsModel.getWidth()).isNotEqualTo(expectedRequiredResult);
        softAssertions.assertAll();
    }

    public void btnCloseItemClick(String path) {
        AssertForm.assertForCurrentForm(mainPage.getWorkSpaceForm());
        mainPage.getWorkSpaceForm().btnCloseItemClick(path);
    }

    public void checkSceneProperties(String path, String expectedResult){
        mainPage.getWorkSpaceForm().itemPictureIsNotPresent(path);
        AssertForm.assertForCurrentForm(mainPage.getScenePropertiesForm());
        int expectedRequiredResult = Integer.parseInt(expectedResult);
        mainPage.getScenePropertiesForm().createModel();
        softAssertions = new SoftAssertions();
        softAssertions.assertThat(ItemPropertiesModel.getWalls()).isEqualTo(expectedRequiredResult);
        softAssertions.assertThat(ItemPropertiesModel.getDoors()).isEqualTo(expectedRequiredResult);
        softAssertions.assertThat(ItemPropertiesModel.getWindows()).isEqualTo(expectedRequiredResult);
        softAssertions.assertThat(ItemPropertiesModel.getProducts()).isEqualTo(expectedRequiredResult);
        softAssertions.assertThat(ItemPropertiesModel.getMaterials()).isEqualTo(expectedRequiredResult);
        softAssertions.assertAll();
    }
}
