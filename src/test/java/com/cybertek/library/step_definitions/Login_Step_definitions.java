package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public void i_a_should_see_dashboard()throws InterruptedException {

        String expected = "dashboard";

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();
        System.out.println("actual = " + actual);


    }
}
