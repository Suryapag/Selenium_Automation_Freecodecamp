package Past2.com.saucedemo.Tests.products;

import Past2.com.saucedemo.Base.BaseTest;
import com.saucedemo.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class Producttest extends BaseTest {

    @Test
    public void testProductIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.getProductHeaderDisplay(),"\n Products Header is Not Displayed\n");
    }
}
