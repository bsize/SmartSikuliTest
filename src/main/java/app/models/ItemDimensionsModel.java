package app.models;

public class ItemDimensionsModel {

    private static Double height;
    private static Double width;
    private static Double length;

    public ItemDimensionsModel(Double height, Double width, Double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public static Double getHeight() {
        return height;
    }

    public static Double getWidth() {
        return width;
    }

    public static Double getLength() {
        return length;
    }

}
