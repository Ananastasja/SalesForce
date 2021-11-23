package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatedAccountPage extends BasePage{
    public CreatedAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(@class,'custom-truncate')]")
    WebElement createdAccountName;
    @FindBy(xpath = "//*[contains(@slot,'secondaryFields')]//lightning-formatted-url//a")
    WebElement createdAccountWebsite;
    @FindBy(xpath = "//*[contains(@slot,'secondaryFields')]//lightning-formatted-phone//a")
    WebElement createdAccountPhone;

    public String getCreatedAccountName() {
        waitForElementLocated(createdAccountName, 10);
        return createdAccountName.getText();
    }

    public String getCreatedAccountWebsite() {
        waitForElementLocated(createdAccountWebsite, 10);
        return createdAccountWebsite.getText();
    }

    public String getCreatedAccountPhone() {
        waitForElementLocated(createdAccountPhone, 10);
        return createdAccountPhone.getText();
    }

//TODO: is that possible to make assertion for the disappearing message "Account was created"?

    /*    @FindBy(xpath = "//span[contains(text(), 'was created')]")
    WebElement successMessage;

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed();
    }*/
}
