package pages;

import elements.DropDown;
import elements.InputField;
import elements.ModalButton;
import elements.TextArea;
import io.qameta.allure.Step;
import objects.Account;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage{
    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    private static final String NEW_ACCOUNT_MODAL_PAGE = "/new";

    @Step("Creating account with '{account}'")
    public NewAccountPage createAccount(Account account) {
        new InputField(driver, "Account Name").writeText(account.getAccountName());
        new InputField(driver, "Website").writeText(account.getWebsite());
        new InputField(driver, "Phone").writeText(account.getPhone());
        new TextArea(driver, "Description").enterTextToTextArea(account.getDescription());
        new TextArea(driver, "Billing Street").enterTextToTextArea(account.getBillingAddress());
        new DropDown(driver, "Type").selectOption(account.getType());
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
