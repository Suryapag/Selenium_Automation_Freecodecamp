package com.demoqa.pages.forms;
import com.demoqa.pages.homepage;
import org.openqa.selenium.By;
import static Utilites.JavaScriptUtility.scrollToElementJS;


public class FormsPage extends homepage{

    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm() {
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
