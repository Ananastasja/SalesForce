package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement usernameInput;
    @FindBy(id = "password")
    WebElement passwordInput;
    @FindBy(id = "Login")
    WebElement loginBtn;


    //TODO: how to write @Step using '{}' for object?
    @Step("Login as user with username: '{username}' and password: '{password}'")
    public LoginPage login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        return this;
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
