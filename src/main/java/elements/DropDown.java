package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown extends Base{
    public DropDown(WebDriver driver, String label) {
        super(driver, label);
    }

    private static final String DROP_DOWN_XPATH = "//*[contains(text(),'%s')]/ancestor::*[contains(@class,'uiInputSelect')]//a";
    private static final String SELECT_OPTION_XPATH = "//*[@class='select-options']/descendant::a[contains(text(),'%s')]";

    public void selectOption(String option) {
        driver.findElement(By.xpath(String.format(DROP_DOWN_XPATH, label))).click();
        driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH, option))).click();
    }
}
