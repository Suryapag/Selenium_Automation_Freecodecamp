package Past2.com.saucedemo.Tests.login;

import Past2.com.saucedemo.Base.BaseTest;
import com.saucedemo.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testloginErrorMMessage() {
        loginPage.setPasswordField("standard_user");
        loginPage.setPasswordField("xyz340299");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.geterrormessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }

}
