package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountTests extends BaseTest {

    private static final String EXPECTED_ACCOUNT_NAME = "Test";
    private static final String EXPECTED_WEBSITE_NAME = "google.com";
    private static final String EXPECTED_PHONE_NUMBER = "+4915225884758";

    @Test(dataProvider = "Login with valid credentials" ,
            dataProviderClass = DataProviderTest.class,
    description = "Login -> create account -> compare name, website and phone of created account on account details page (right after clicking Save btn")
    public void createAccount1Test(String username, String password, String accountName, String website, String phone, String description, String billingAddress) {
        basePage.openUrl()
                .login(username, password)
                .clickLoginBtn();
        newAccountPage.openModalWindowPage()
                .createAccount(accountName, website, phone, description, billingAddress)
                .clickSave();
        Assert.assertEquals(createdAccountPage.getCreatedAccountName(), EXPECTED_ACCOUNT_NAME);
        Assert.assertEquals(createdAccountPage.getCreatedAccountWebsite(), EXPECTED_WEBSITE_NAME);
        Assert.assertEquals(createdAccountPage.getCreatedAccountPhone(), EXPECTED_PHONE_NUMBER);
    }

    @Test(dataProvider = "Login with valid credentials" ,
            dataProviderClass = DataProviderTest.class,
            description = "Login -> create account -> compare name and phone of created account on Account list page (last created)")
    public void createAccount2Test(String username, String password, String accountName, String website, String phone, String description, String billingAddress) {
        basePage.openUrl()
                .login(username, password)
                .clickLoginBtn();
        newAccountPage.openModalWindowPage()
                .createAccount(accountName, website, phone, description, billingAddress)
                .clickSave();
        accountsListPage.openAccountsList();
        Assert.assertEquals(accountsListPage.getLastAccountName(), EXPECTED_ACCOUNT_NAME);
        Assert.assertEquals(accountsListPage.getLastAccountPhone(), EXPECTED_PHONE_NUMBER);
    }
}