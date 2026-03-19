package steps;

import io.cucumber.java.After;
import parabank.driver.Driver;

public class Hooks {

    @After
    public void tearDown() {
        Driver.quitDriver(); // Testdən sonra Chrome bağlanır
    }
}