package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputField extends Base {

    public InputField(WebDriver driver, String label) {
        super(driver, label);
    }

    private static final String INPUT_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//input";

    public void writeText(String text) {
        waitForElementLocated(driver.findElement(By.xpath(String.format(INPUT_XPATH, label))), 10);
        driver.findElement(By.xpath(String.format(INPUT_XPATH, label))).sendKeys(text);
    }
}
