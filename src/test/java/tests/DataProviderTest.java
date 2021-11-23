package tests;

import objects.Account;
import objects.User;
import org.testng.annotations.DataProvider;

import java.util.Iterator;

import static java.util.Arrays.asList;

public class DataProviderTest extends BaseTest {

    //TODO: when using only 1 object everything is red
    @DataProvider(name = "Create account")
    private static Iterator<Object[]> account() {
        return asList(
                new Object[]{new User("ananastasja-0mcv@force.com", "Gq2KPsXekAb*ySd%")},
                new Object[]{new Account("Hello world", "", "+375258547856", "", "", "Kunde")}
        ).iterator();
    }
}