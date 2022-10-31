package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CentrilliPage {
    public CentrilliPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='login']")
    public WebElement email;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement LoginButton;

    @FindBy(xpath = "//span[.='POSManager10']")
    public WebElement dropDown;

    @FindBy (xpath = "//a[.='Log out']")
    public WebElement logOut;
}
