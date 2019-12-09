package app.models;

public class ProductItemModel {

    private String itemInMenu;
    private String referencePicture;
    private String pathForPicture;

    public ProductItemModel(String itemInMenu, String pathForPicture, String referencePicture) {
        this.itemInMenu = itemInMenu;
        this.pathForPicture = pathForPicture;
        this.referencePicture = referencePicture;
    }

    public String getItemInMenu() {
        return pathForPicture + itemInMenu;
    }

    public String getPathForPicture() {
        return pathForPicture;
    }

    public String getReferencePicture() {
        return pathForPicture + referencePicture;
    }
}
