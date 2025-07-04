package Part3_4.com.demoqa.base;

import com.demoqa.pages.homepage;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static Utilites.utility.setUtilityDriver;
import static com.base.BasePage.*;

public class basetest {

    private WebDriver driver;
    protected BasePage basePage;
    protected homepage homepage;
    private String DEMOQA_URL = "https://demoqa.com";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homepage = new homepage();
    }

    @AfterClass
    public void tearDown() {
        delay(3000);
        driver.quit();
    }

}
