package web_driver.asserts;

import org.testng.Assert;
import web_driver.entity.BaseForm;

public class AssertForm {
    public static void assertForCurrentForm(BaseForm form){
        Assert.assertTrue(form.currentForm(), "This form isn't right");
    }
}
