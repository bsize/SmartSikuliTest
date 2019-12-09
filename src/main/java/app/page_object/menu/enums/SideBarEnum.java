package app.page_object.menu.enums;

public enum SideBarEnum {
    BUILD("Build room layout"),
    FURNISH("Furnish your room"),
    DECORATE("Decorate your room"),
    MANAGE("Manage lights"),
    POPULATE("Populate your list"),
    PROPERTIES("Properties");

    private String value;

    SideBarEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
