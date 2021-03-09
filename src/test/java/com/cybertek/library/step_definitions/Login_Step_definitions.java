package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_definitions {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
String url = ConfigurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);
    }



    @When("I log in as a librarian")
    public void i_log_in_as_a_librarian() {
        String username=ConfigurationReader.getProperty("lib22_user");
        String password=ConfigurationReader.getProperty("lib22_pass");

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.signInButton.click();

    }
    @Then("I a should see dashboard")
    public void i_a_should_see_dashboard() {

    }
}
