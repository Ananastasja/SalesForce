package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalButton extends Base{

    private static final String MODAL_BTNS_XPATH = "//*[contains(@class,'button-container-inner')]//*[text()= '%s']";

    public ModalButton(WebDriver driver, String label) {
        super(driver, label);
    }

    public void clickOnModalBtn() {
        driver.findElement(By.xpath(String.format(MODAL_BTNS_XPATH, label))).click();
    }
}
