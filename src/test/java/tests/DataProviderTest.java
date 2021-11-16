package tests;

import org.testng.annotations.DataProvider;

public class DataProviderTest extends BaseTest{
    @DataProvider(name = "Login with valid credentials")
    public Object[][] validLoginCredentials() {
        return new Object[][]{
                {"ananastasja-0mcv@force.com", "Gq2KPsXekAb*ySd%", "Test", "google.com", "+4915225884758", "desc", "Kaiserdamm 125"},
        };
    }
}

