package com.saucedemo;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    private By ProductHeader = By.xpath("//span[text():'Products");

    public boolean getProductHeaderDisplay() {
        return find(ProductHeader).isDisplayed();
    }
}
