package app.page_object.menu.enums;

public enum BrowseCategoriesEnum {
    ACCESSORIES("Accessories"),
    ARCHITECTURE("Architecture"),
    BATHROOM("Bathroom"),
    BEDROOM("Bedroom"),
    CHRISTMAS("Christmas"),
    DINING_ROOM("Dining room"),
    DIY("Diy"),
    DRILLS("Drills & drill bits"),
    ELECTRICAL("Electrical"),
    FURNITURE("Furniture types"),
    GARDEN("Garden & outdoor"),
    GYM("Gym"),
    HOME_ENTERTAINMENT("Home entertainment"),
    KIDS_ROOM("Kids' room"),
    KITCHEN("Kitchen"),
    LIGHTING("Lighting"),
    LIVING_ROOM("Living room"),
    MISCELLANEOUS("Miscellaneous"),
    OFFICE("Office"),
    PEOPLE("People & animals");

    private String value;

    BrowseCategoriesEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
