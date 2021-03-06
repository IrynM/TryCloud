package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Locale;

public class BasePage {

    public BasePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "svg[viewBox~='24']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@type=\'search\']")
    public WebElement searchInput;

    //this list of web elements contains 1 extra at the end
    //Dashboard,Files,Photos,Activity ect
    @FindBy(xpath = "//ul[@id='appmenu']//a")
    public List<WebElement> subModules;

    @FindBy(xpath = "//ul[@aria-label='Files']//h3")
    public WebElement expectedSearchResult;

    @FindBy(xpath = "//input[@aria-label='Reset search']")
    public WebElement resetsearchBtn;

    @FindBy(xpath = "//span//h3")
    public WebElement firstSearchedResult;

    //when you search something that not exist
    @FindBy(xpath = "(//div[@class='empty-content']//h2[@class='empty-content__title'])[1]")
    public WebElement NoResultMessageForSearch;


    public void navigateToModule(String module){
        module=module.toLowerCase();
        String locator= "";
        if(module.equals("talk")){
            locator="//ul[@id='appmenu']//li[@data-id='spreed']";
            Driver.getDriver().findElement(By.xpath(locator)).click();
            BrowserUtils.waitForPageToLoad(3);
        }else{
            locator="//ul[@id='appmenu']//li[@data-id='"+module+"']";
            Driver.getDriver().findElement(By.xpath(locator)).click();
            BrowserUtils.waitForPageToLoad(3);
        }
    }


    public void navigateToModule1(String module){
        String locator = "//ul[@id='appmenu']//a[@aria-label='"+module+"']";
        WebElement eachModule = Driver.getDriver().findElement(By.xpath(locator));
        BrowserUtils.highlight(eachModule);
        eachModule.click();
    }
}
