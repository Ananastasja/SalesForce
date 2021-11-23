package tests;

import objects.Account;
import org.testng.annotations.DataProvider;

import java.util.Iterator;

import static java.util.Arrays.asList;

public class DataProviderTest extends BaseTest {

    //TODO: when using only 1 object everything is red
    @DataProvider(name = "Create account")
    private static Iterator<Object[]> account() {
        return asList(
                new Object[]{new Account("Hello world", "google.com", "+375258548556", "decr", "Kaiserdamm 125", "Analyst")},
                new Object[]{new Account("Hello world", "tut.by", "+375258547856", "", "", "Kunde")}
        ).iterator();
    }
}