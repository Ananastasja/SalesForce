package pages;

import io.qameta.allure.Step;
import objects.User;
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
    @Step("Login as '{user}'")
    public LoginPage login(User user) {
        usernameInput.sendKeys(user.getUsername());
        passwordInput.sendKeys(user.getPassword());
        return this;
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }
}
