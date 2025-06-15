package com.saucedemo.pages;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("login_button_container h3");

    public void setUsernameField(String username) {
        set(usernameField, username);
    }

    public void setPasswordField(String password) {
        set(passwordField, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }
}
