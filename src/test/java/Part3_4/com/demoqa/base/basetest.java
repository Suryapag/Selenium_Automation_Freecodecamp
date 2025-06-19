package Part3_4.com.demoqa.base;

import com.demoqa.pages.homepage;
import com.saucedemo.BasePage;
import org.checkerframework.checker.lock.qual.Holding;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class basetest {

    private WebDriver driver;
    protected BasePage basePage;
    protected homepage homepage;
    private String DEMOQA_URL = "";

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
        homepage = new homepage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
