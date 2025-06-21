package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.saucedemo.BasePage;
import org.openqa.selenium.By;

import static Utilites.JavaScriptUtility.scrollToElementJS;

public class homepage extends BasePage  {
    private By formsCord = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCord);
        click(formsCord);
        return new FormsPage();

    }
}
