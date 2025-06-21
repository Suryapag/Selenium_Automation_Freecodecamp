package Utilites;

import org.openqa.selenium.*;

public class JavaScriptUtility extends utility{

    public static void scrollToElementJS(By locator) {
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }
}
