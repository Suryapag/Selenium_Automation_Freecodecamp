package Part3_4.com.demoqa.test.Part3.forms;

import Part3_4.com.demoqa.base.basetest;
import org.testng.annotations.Test;

public class Radiobuttontest extends basetest {

    @Test
    public void testRadiobutton() {
        var formsPage = homepage.goToForms();
        formsPage.clickPracticeForm();
    }

}
//git working