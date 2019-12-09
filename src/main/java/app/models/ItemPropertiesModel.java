package app.models;

public class ItemPropertiesModel {

    private static int walls;
    private static int doors;
    private static int windows;
    private static int products;
    private static int materials;

    public ItemPropertiesModel(int walls, int doors, int windows, int products, int materials) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.products = products;
        this.materials = materials;
    }

    public static int getWalls() {
        return walls;
    }

    public static int getDoors() {
        return doors;
    }

    public static int getWindows() {
        return windows;
    }

    public static int getProducts() {
        return products;
    }

    public static int getMaterials() {
        return materials;
    }
}
