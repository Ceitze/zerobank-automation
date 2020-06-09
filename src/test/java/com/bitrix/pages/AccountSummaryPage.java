package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage extends BasePage{


    public AccountSummaryPage() {
            PageFactory.initElements(Driver.get(), this);
        }


    @FindBy(xpath = "//a[contains(text(),'Account Summary')]")
    public WebElement zero_AccountSummary;

    @FindBy(xpath = "//h2[contains(text(),'Cash Accounts')]")
    public WebElement Cash_Accounts;

    @FindBy(xpath = "//h2[contains(text(),'Investment Accounts')]")
    public WebElement Investment_Accounts;

    @FindBy(xpath = "//h2[contains(text(),'Credit Accounts')]")
    public WebElement Credit_Accounts;


    @FindBy(xpath = "(((//table[@class='table'])//thead)//tr)[3]")
    List<WebElement> Credit_AccountsOptions;

    //table[@class='table']//thead//tr/th

//    @FindBy(xpath = "//input[@id='searchTerm']")
//    public WebElement Account;
//
//    @FindBy(xpath = "//input[@id='searchTerm']")
//    public WebElement Credit_Card;
//
//    @FindBy(xpath = "//input[@id='searchTerm']")
//    public WebElement Balance;

    @FindBy(xpath = "//h2[contains(text(),'Loan Accounts')]")
    public WebElement Loan_Accounts;

    @FindBy(xpath = "(//a[text()='Savings'])[1]")
    public WebElement Savings1;

    @FindBy(xpath = "(//a[text()='Savings'])[2]")
    public WebElement Savings2;


   @FindBy(xpath = "//a[contains(text(),'Brokerage')]")
    public WebElement BrokerageLink;

    @FindBy(xpath =   "//a[contains(text(),'Checking')]")
    public WebElement CheckingLink;

    @FindBy(xpath =   "//a[contains(text(),'Credit Card')]")
    public WebElement CreditCard;

    @FindBy(xpath =   "//a[contains(text(),'Loan')]")
    public WebElement LoanLink;

}

