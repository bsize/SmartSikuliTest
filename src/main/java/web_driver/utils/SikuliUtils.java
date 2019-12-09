package web_driver.utils;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import web_driver.logger.Logger;

import java.io.File;

public class SikuliUtils {

    private static Logger logger = Logger.getInstance();
    private static Screen screen;
    private static String pathDir = System.getProperty("user.dir")+ File.separator;

    public static void dragAndDrop(String pathOne, String pathTwo){
        screen = new Screen();
        Pattern patternOne = new Pattern(pathDir + pathOne);
        Pattern patternTwo = new Pattern(pathDir + pathTwo);
        try {
            screen.dragDrop(patternOne, patternTwo);
            logger.info("Item was moved");
        } catch (FindFailed findFailed) {
            logger.fatal("Item wasn't moved");
        }
    }

    public static void isPresent(String path){
        screen = new Screen();
        Pattern pattern = new Pattern(pathDir+path);
        try {
            screen.find(pattern);
            logger.info("The item is displayed correctly (according to the reference picture)");
        } catch (FindFailed findFailed) {
            logger.fatal("The item isn't displayed correctly (according to the reference picture)");
        }
    }

    public static void click(String path, String name){
        screen = new Screen();
        Pattern pattern = new Pattern(pathDir + path);
        try {
            screen.click(pattern);
            logger.info(String.format("Click on '%s' button" ,name));
        } catch (FindFailed findFailed) {
            logger.fatal(String.format("The '%s'  button isn't present", name));
        }
    }

    public static void itemClick(String path){
        screen = new Screen();
        Pattern pattern = new Pattern(pathDir + path);
        try {
            screen.click(pattern);
            logger.info("Click on item");
        } catch (FindFailed findFailed) {
            logger.fatal("The item isn't present");
        }
    }
}