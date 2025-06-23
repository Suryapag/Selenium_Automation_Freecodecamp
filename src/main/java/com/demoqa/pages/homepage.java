package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Utilites.JavaScriptUtility.scrollToElementJS;

public class homepage extends BasePage  {
    private By formsCord = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCord);
        click(formsCord);
        return new FormsPage();

    }

    public static void clickJS(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
