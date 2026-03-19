package steps;

import io.cucumber.java.en.Given;
import parabank.pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage();
    }

    @Given("I am on the ParaBank home page")
    public void i_am_on_the_para_bank_home_page() {
        loginPage.openHomePage();
    }
}