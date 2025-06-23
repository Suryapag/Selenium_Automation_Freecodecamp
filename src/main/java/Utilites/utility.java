package Utilites;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }
}
