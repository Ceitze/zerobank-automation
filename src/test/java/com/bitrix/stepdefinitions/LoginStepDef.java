package com.bitrix.stepdefinitions;

import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {
        String username=ConfigurationReader.get("bank_username");
        String password=ConfigurationReader.get("bank_password");
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertEquals("verify message","Account Summary",actualTitle);
    }


}
