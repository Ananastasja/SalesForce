package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsListPage extends BasePage {
    public AccountsListPage(WebDriver driver) {
        super(driver);
    }

    private static final String ACCOUNTS_LIST_URL = "/list";

    @FindBy(xpath = "//tr[1]//*[contains(@class, 'outputLookupLink')]")
    WebElement lastAccountName;
    @FindBy(xpath = "//tr[1]//a/descendant::*[contains(@class, 'OutputPhone')]")
    WebElement lastAccountPhone;

    public void openAccountsList() {
        openPage(ACCOUNTS_LIST_URL);
    }

    public String getLastAccountName() { return lastAccountName.getText();
    }

    public String getLastAccountPhone() {
        return lastAccountPhone.getText();
    }
}
