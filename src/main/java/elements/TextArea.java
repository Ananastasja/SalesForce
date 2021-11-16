package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea extends Base {

    public TextArea(WebDriver driver, String label) {
        super(driver, label);
    }

    private static final String TEXT_AREA_XPATH = "//*[contains(text(),'%s')]/ancestor::*[contains(@class,'uiInput')]//textarea";

    public void enterTextToTextArea(String text) {
        waitForElementLocated(driver.findElement(By.xpath(String.format(TEXT_AREA_XPATH, label))), 10);
        driver.findElement(By.xpath(String.format(TEXT_AREA_XPATH, label))).sendKeys(text);
    }
}
