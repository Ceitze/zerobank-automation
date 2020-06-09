package com.bitrix.stepdefinitions;

import com.bitrix.pages.AccountActivityPage;
import com.bitrix.pages.AccountSummaryPage;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityNavigationStepDef {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        AccountSummaryPage AccountSummaryPage=new AccountSummaryPage();
        BrowserUtils.waitFor(3);
        AccountSummaryPage.Savings1.click();

    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        AccountActivityPage AccountActivityPage=new AccountActivityPage();
        System.out.println("AccountActivityPage.AccountActivity.getText() = " + AccountActivityPage.AccountActivity.getText());
        Assert.assertEquals("Verify that account activity is displayed","Account Activity",AccountActivityPage.AccountActivity.getText());
    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        WebElement dropdownOptionSaving = Driver.get().findElement(By.id("aa_accountId"));
        Select accountSelectSaving= new Select(dropdownOptionSaving);
        List<WebElement> options = accountSelectSaving.getOptions();
        System.out.println("options.size() = " + options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());
            String expectedOption = "Savings";
            String actual=accountSelectSaving.getFirstSelectedOption().getText();
            Assert.assertEquals("verify that default savings displayed",expectedOption,actual);
//            Thread.sleep(2000);
//            accountSelectSaving.selectByVisibleText("");
//            Thread.sleep(2000);
//            accountSelectSaving.selectByIndex(4);

//            expectedOption="";
//            actual = accountSelectSaving.getFirstSelectedOption().getText();
//            Assert.assertEquals(actual,expectedOption);


    }
    }
    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
     AccountSummaryPage  AccountSummaryPage= new AccountSummaryPage();
        System.out.println("AccountSummaryPage.BrokerageLink = " + AccountSummaryPage.BrokerageLink);
        AccountSummaryPage.BrokerageLink.click();
    }

    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
        WebElement dropdownOptionSaving = Driver.get().findElement(By.id("aa_accountId"));
        Select accountSelectSaving = new Select(dropdownOptionSaving);
        List<WebElement> options = accountSelectSaving.getOptions();
        System.out.println("options.size() = " + options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());
            String expectedOption = "Brokerage";
            String actual = accountSelectSaving.getFirstSelectedOption().getText();
            Assert.assertEquals("verify that default brokerage link displayed", expectedOption, actual);

        }
    }
    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
      AccountSummaryPage AccountSummaryPage=new AccountSummaryPage();
      AccountSummaryPage.CheckingLink.click();
    }

    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        WebElement dropdownOptionSaving = Driver.get().findElement(By.id("aa_accountId"));
        Select accountSelectSaving = new Select(dropdownOptionSaving);
        List<WebElement> options = accountSelectSaving.getOptions();
        System.out.println("options.size() = " + options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());
            String expectedOption = "Checking";
            String actual = accountSelectSaving.getFirstSelectedOption().getText();
            Assert.assertEquals("verify that default checking link displayed", expectedOption, actual);
        }
    }
    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        AccountSummaryPage AccountSummaryPage= new AccountSummaryPage();
        AccountSummaryPage.CreditCard.click();
    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
        WebElement dropdownOptionSaving = Driver.get().findElement(By.id("aa_accountId"));
        Select accountSelectSaving = new Select(dropdownOptionSaving);
        List<WebElement> options = accountSelectSaving.getOptions();
        System.out.println("options.size() = " + options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());
            String expectedOption = "Credit Card";
            String actual = accountSelectSaving.getFirstSelectedOption().getText();
            Assert.assertEquals("verify that default CreditCard displayed", expectedOption, actual);
        }

    }
    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        AccountSummaryPage AccountSummaryPage= new AccountSummaryPage();
        AccountSummaryPage.LoanLink.click();
    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        WebElement dropdownOptionSaving = Driver.get().findElement(By.id("aa_accountId"));
        Select accountSelectSaving = new Select(dropdownOptionSaving);
        List<WebElement> options = accountSelectSaving.getOptions();
        System.out.println("options.size() = " + options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());
            String expectedOption = "Loan";
            String actual = accountSelectSaving.getFirstSelectedOption().getText();
            Assert.assertEquals("verify that default Loan Link displayed", expectedOption, actual);
        }
    }
}
