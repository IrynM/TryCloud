package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement logInButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongEmailOrPassMessage;


    @FindBy(id = "dashboard")
    public WebElement dashboardIcon;

    @FindBy(xpath = "//ul[@id='appmenu']//li")
    public List<WebElement> allModulesFromDashboard;



    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

}
