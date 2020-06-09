package com.bitrix.stepdefinitions;

import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
        String user= ConfigurationReader.get("driver_username");
        String pas=ConfigurationReader.get("driver_password");
        if (username.equals(user) && password.equals(pas)){
            System.out.println("Account summary page should be displayed");
        }else{
            System.out.println("Login and/or password are wrong");
        }
    }

//    @When("the user enter the driver information")
//    public void the_user_enter_the_driver_information() {
//        String username=ConfigurationReader.get("driver_username");
//        String password=ConfigurationReader.get("driver_password");
//        LoginPage loginPage=new LoginPage();
//        loginPage.login(username,password);
//    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
       // String actualTitle = Driver.get().getTitle();
        String actualTitle = Driver.get().getTitle().replace("Zero - ", "");
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        Assert.assertEquals("verify message","Account Summary",actualTitle);
    }

    @Then("the user should be able to not login")
    public void the_user_should_be_able_to_not_login() {
        BrowserUtils.waitFor(3);
        Driver.get().findElement(By.xpath("//div[@class='alert alert-error']")).isDisplayed();
        System.out.println("Driver.get().findElement(By.xpath(\"//div[@class='alert alert-error']\")).getText() = " + Driver.get().findElement(By.xpath("//div[@class='alert alert-error']")).getText());
        String actual=Driver.get().findElement(By.xpath("//div[@class='alert alert-error']")).getText();
         Assert.assertEquals("verify that wrong message displayed","Login and/or password are wrong.",actual);

    }
}
