package com.cydeo.step_definitions;

import com.cydeo.pages.Employment;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CentrilliStepDefinitions {
    Employment centrilliPage = new Employment();
    @Given("user is on the centrilli login page")
    public void user_is_on_the_centrilli_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user clicks login")
    public void user_clicks_login() {
        centrilliPage.loginButton.click();
        BrowserUtils.sleep(2);
    }



    @Given("user is logged in the application")
    public void userIsLoggedInTheApplication() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        centrilliPage.login();

        BrowserUtils.sleep(3);


    }

    @When("user enters email {string}")
    public void userEntersEmail(String email) {
        centrilliPage.inputEmail.sendKeys(email);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        centrilliPage.inputPassword.sendKeys(password);
    }

    @When("user clicks on Employees module")
    public void userClicksOnEmployeesModule() {

        centrilliPage.employeesButton.click();

        BrowserUtils.sleep(1);

    }


    @Then("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        centrilliPage.createButton.click();

    }

    @And("user enters employee's name")
    public void userEntersEmployeeSName() {
        centrilliPage.inputEmployeesName.sendKeys("John");
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {

        centrilliPage.saveButton.click();
        BrowserUtils.sleep(2);
    }


    @Then("user clicks save button to see the error message")
    public void userClicksSaveButtonToSeeTheErrorMessage() {
        centrilliPage.saveButton.click();

    }

    @And("user clicks on discard button")
    public void userClicksOnDiscardButton() {
        centrilliPage.discardButton.click();

    }

    @Then("user clicks the search box and types employee's name and presses enter")
    public void userClicksTheSearchBoxAndTypesEmployeeSNameAndPressesEnter() {
        centrilliPage.searchBox.sendKeys("John" + Keys.ENTER);
        BrowserUtils.sleep(1);
    }

    @And("user clicks on list button")
    public void userClicksOnListButton() {
        centrilliPage.listButton.click();
    }
    @And("user clicks on kanban button")
    public void userClicksOnKanbanButton() {
        centrilliPage.kanbanButton.click();
    }




    @Then("user enters {string}")
    public void userEnters(String nameTest) {
        centrilliPage.inputEmployeesName.sendKeys(nameTest);
        BrowserUtils.sleep(1);
    }

    @Then("user clicks on list and number increased by one")
    public void userClicksOnListAndNumberIncreasedByOne() {
        centrilliPage.listButton.click();
        BrowserUtils.sleep(1);
    }

    @And("user clicks on create button")
    public void userClicksOnCreateButton() {
        centrilliPage.createButton.click();
    }

    @And("user can see employee's name on an Employee page")
    public void userCanSeeEmployeeSNameOnAnEmployeePage() {
        Assert.assertTrue(centrilliPage.employeeNameCreated.isDisplayed());
    }

    @Then("user should see the error message")
    public void userShouldSeeTheErrorMessage() {
        Assert.assertTrue(centrilliPage.errorMessage.isDisplayed());
    }

    @Then("user types employee's name  in the search box and presses enter")
    public void userTypesEmployeeSNameInTheSearchBoxAndPressesEnter() {
        centrilliPage.searchBox.sendKeys("John" + Keys.ENTER);
        BrowserUtils.sleep(1);
    }

    @Then("user cancels by clicking Discard button and sees create button")
    public void userCancelsByClickingDiscardButtonAndSeesCreateButton() {
        Assert.assertTrue(centrilliPage.createButton.isDisplayed());
    }

    @And("user sees the title is changed to the new Employee name")
    public void userSeesTheTitleIsChangedToTheNewEmployeeName() {
        Assert.assertTrue(centrilliPage.titleMessage.isDisplayed());
    }

    @Then("user sees the Employee created message at the bottom of the page")
    public void userSeesTheEmployeeCreatedMessageAtTheBottomOfThePage() {
        Assert.assertTrue(centrilliPage.employeeCreatedMessage.isDisplayed());
    }

    @And("user can find the new created employee under Employee list")
    public void userCanFindTheNewCreatedEmployeeUnderEmployeeList() {
        Assert.assertTrue(centrilliPage.createdEmployee.isDisplayed());
    }

    @Then("user sees the change on Employee display from Kanban to List")
    public void userSeesTheChangeOnEmployeeDisplayFromKanbanToList() {
        Assert.assertTrue(centrilliPage.listButton.isDisplayed());
    }

    @Then("user sees that all employee number increased one")
    public void userSeesThatAllEmployeeNumberIncreasedOne() {
        Assert.assertTrue(centrilliPage.allEmployeeNumber.isDisplayed());
    }
    @Then("user clicks on list button to verify number")
    public void userClicksOnListButtonToVerifyNumber() {
        centrilliPage.listButton.click();
        BrowserUtils.sleep(1);
    }
    @Then("user sees that all employee number increased {int}")
    public void userSeesThatAllEmployeeNumberIncreased(int addedOne) {

        String numbersExpected = centrilliPage.employeeNumbers.getText();
        System.out.println("numbersExpected = " + numbersExpected);
        int expected = Integer.parseInt(String.valueOf(numbersExpected));

        centrilliPage.createButton.click();
        centrilliPage.inputEmployeesName.sendKeys("Jordan");
        centrilliPage.saveButton.click();
        centrilliPage.employeesButton.click();

        BrowserUtils.sleep(1);
        String numbersActual = centrilliPage.employeeNumbers.getText();
        int actual = Integer.parseInt(String.valueOf(numbersActual));

        if (expected>actual){

        }
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);


    }

}
