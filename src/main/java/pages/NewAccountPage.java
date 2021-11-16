package pages;

import elements.InputField;
import elements.ModalButton;
import elements.TextArea;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage{
    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    private static final String NEW_ACCOUNT_MODAL_PAGE = "/new";

    public NewAccountPage createAccount(String accountName, String website, String phone, String description, String billingStreet) {
        new InputField(driver, "Account Name").writeText(accountName);
        new InputField(driver, "Website").writeText(website);
        new InputField(driver, "Phone").writeText(phone);
        new TextArea(driver, "Description").enterTextToTextArea(description);
        new TextArea(driver, "Billing Street").enterTextToTextArea(billingStreet);
        return this;
    }

    public NewAccountPage openModalWindowPage() {
        openPage(NEW_ACCOUNT_MODAL_PAGE);
        return this;
    }

    public CreatedAccountPage clickSave() {
        new ModalButton(driver, "Save").clickOnModalBtn();
        return new CreatedAccountPage(driver);
    }
}
