package com.bitrix.pages;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class  BasePage {

    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li")
    public List<WebElement> menuOptions;

    ////a[@class='dropdown-toggle'])[contains(text(),'Zion Schaefer')]
    @FindBy(xpath = "//input[@id='searchTerm']")
    public  WebElement searchButton;

    @FindBy(xpath = "//a[contains(text(),'Account Summary')]")
    public  WebElement accountSummary;

    @FindBy(xpath = "//a[contains(text(),'Account Activity')]")
    public  WebElement accountActivity;

    @FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
    public  WebElement transferFunds;

    @FindBy(xpath = "//a[contains(text(),'Pay Bills')]")
    public  WebElement payBiils;

    @FindBy(xpath = "//a[contains(text(),'My Money Map')]")
    public  WebElement myMoneyMap;

    @FindBy(xpath = "//a[contains(text(),'Online Statements')]")
    public  WebElement onlineStatements;

    @FindBy(xpath = "//i[@class='icon-cog']")
    public WebElement settingsIcon;

    @FindBy(css = "//a[contains(text(),'Account Summary')]")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(css = "//h2[contains(text(),'Cash Accounts')]")
    public WebElement pageSubTitle;

    @FindBy(xpath = "//a[@class='brand']")
    public WebElement ZeroBank;

    @FindBy(xpath = "//body/div[@class='wrapper']/div[@class='navbar navbar-fixed-top']/div[@class='navbar-inner']/div[@class='container']/div[@id='settingsBox']/ul[@class='nav float-right']/li[3]/a[1]")
    public WebElement userName;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    @FindBy(linkText = "My Profile")
    public WebElement myProfile;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getUserName() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }


    public void logOut() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }

    public void goToMyUser() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(myProfile, 5).click();

    }


}
