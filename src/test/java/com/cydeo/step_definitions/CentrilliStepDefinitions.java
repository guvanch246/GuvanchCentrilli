package com.cydeo.step_definitions;

import com.cydeo.pages.CentrilliPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CentrilliStepDefinitions {
    CentrilliPage centrilliPage = new CentrilliPage();
    @Given("user is on the centrilli login page")
    public void user_is_on_the_centrilli_login_page() {
        Driver.getDriver().get("https://qa.centrilli.com/");
    }
    @When("user enters email")
    public void user_enters_email() {
        centrilliPage.email.sendKeys("posmanager10@info.com");
    }
    @When("user enters password")
    public void user_enters_password() {
        centrilliPage.password.sendKeys("posmanager");
    }
    @Then("user clicks login")
    public void user_clicks_login() throws InterruptedException {
        centrilliPage.LoginButton.click();
        Thread.sleep(4000);
    }

    @When("user clicks POSManager10")
    public void user_clicks_pos_manager10() throws InterruptedException {
        centrilliPage.dropDown.click();
        Thread.sleep(1500);
    }

    @Then("user clicks logout")
    public void user_clicks_logout() {
        centrilliPage.logOut.click();
    }
}
