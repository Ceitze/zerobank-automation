package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage extends BasePage {

    public void AccountSummaryPage() { PageFactory.initElements(Driver.get(), this); }

/**
 * Account Activity
 * Account Activity page should have the title Zero – Account activity.
 * In the Account drop down default option should be Savings. Account drop down
 * should have the following options: Savings, Checking, Loan, Credit Card, Brokerage.
 * Transactions table should have column names Date, Description, Deposit,
 * Withdrawal.
 */

        @FindBy(xpath="//a[contains(text(),'Account Activity')]")
        public WebElement AccountActivity;

         @FindBy(xpath ="//select[@id='aa_accountId']")
        public  WebElement DefaultDropDown;









}
