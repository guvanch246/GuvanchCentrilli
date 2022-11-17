package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employment {
    public Employment(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='login']")
    public WebElement inputEmail;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//a[@href='/web#menu_id=157&action=']")
    public WebElement employeesButton;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new btn-default']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement inputEmployeesName;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;

    @FindBy (xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy (xpath = "//button[@class='btn btn-default btn-sm o_form_button_cancel']")
    public WebElement discardButton;

    @FindBy (xpath = "//li[.='John']")
    public WebElement titleMessage;

    @FindBy (xpath = "//*[contains(text(),'Employee created')]")
    public WebElement employeeCreatedMessage;

    @FindBy (xpath = "//input[@placeholder='Search...']")
    public WebElement searchBox;

    @FindBy (xpath = "//span[.='John']")
    public WebElement createdEmployee;

    @FindBy (xpath = "//button[@data-original-title='List']")
    public WebElement listButton;

    @FindBy (xpath = "//button[@data-original-title='Kanban']")
    public WebElement kanbanButton;

    @FindBy (xpath = "//span[@class='o_pager_limit']")
    public WebElement allEmployeeNumber;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButtonList;

    @FindBy (xpath = "//span[@name='name']")
    public WebElement employeeNameCreated;

    @FindBy (xpath = "//span[@class='o_pager_limit']")
    public WebElement employeeNumbers;


    @FindBy (xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[18]/td[3]")
    public WebElement pageCounter;


    public void login(){
        this.inputEmail.sendKeys("posmanager10@info.com");
        this.inputPassword.sendKeys("posmanager");
        this.loginButton.click();
    }

    public void login(String username, String pw){
        inputEmail.sendKeys(username);
        inputPassword.sendKeys(pw);
        loginButton.click();
    }

}
