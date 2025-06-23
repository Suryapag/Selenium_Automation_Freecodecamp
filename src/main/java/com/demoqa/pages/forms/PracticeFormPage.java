package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Utilites.JavaScriptUtility.scrollToElementJS;
public class PracticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }


}
