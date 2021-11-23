package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static final String BASE_URL = "https://hotzonegmbh.my.salesforce.com";
    public static final String OTHER_URLS = "https://hotzonegmbh.lightning.force.com/lightning/o/Account";

    @Step("Opening '{certainUrl}'")
    public void openPage(String certainUrl) {
        driver.get(OTHER_URLS + certainUrl);
    }

    @Step("Opening home page")
    public LoginPage openBaseUrl() {
        driver.get(BASE_URL);
        return new LoginPage(driver);
    }

    public void waitForElementLocated(WebElement element, int timeout) {
        wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
