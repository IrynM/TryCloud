package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BasePage {

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


    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement filesModule;


    ////label[@for='select_all_files']
  //  @FindBy(xpath = "//th[@id='headerSelection'][1]")
    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement checkboxFiles;

//    @FindBy(xpath = "//table[@class='list-container  has-controls']")
//public WebElement getCheckboxFiles2;



    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        this.username.sendKeys(ConfigurationReader.getProperty("user"));
        this.password.sendKeys(ConfigurationReader.getProperty("password"));
        this.logInButton.click();
    }

}
