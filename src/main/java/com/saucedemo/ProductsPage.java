package com.saucedemo;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{

    private By ProductHeader = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public boolean getProductHeaderDisplay() {
        return find(ProductHeader).isDisplayed();
    }
}
