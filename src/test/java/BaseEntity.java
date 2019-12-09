
import app.steps.Steps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import web_driver.Browser;
import web_driver.logger.Logger;
import web_driver.utils.Waiters;

public abstract class BaseEntity {
    protected static Logger logger = Logger.getInstance();
    private static Browser browser;
    public Steps steps = new Steps();

    @BeforeClass
    public void before() {
        logger.logTestName(this.getClass().getName());
        browser = Browser.getInstance();
        browser.windowMaximise();
        browser.navigate(Browser.getUrl());
        Waiters.waitForPageToLoad();
    }

    @AfterClass
    public void after() {
        browser.exit();
    }
}
