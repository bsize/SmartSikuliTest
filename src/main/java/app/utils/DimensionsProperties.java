package app.utils;

import web_driver.logger.Logger;

public class DimensionsProperties {

    private static final String DIVDER = "x";
    private static Logger logger = Logger.getInstance();
    private static Double height;
    private static Double width;
    private static Double length;

    public static void lblDimensionsInfo(String text) {
        String str = text.replace(" ", "").replace("H", "").replace("W", "").replace("D", "").replace("m", "");
        String[] allDimensions = str.split(DIVDER);
        height = Double.parseDouble(allDimensions[0]);
        width = Double.parseDouble(allDimensions[1]);
        length = Double.parseDouble(allDimensions[2]);
        logger.info("Create ItemSizeModel");
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
