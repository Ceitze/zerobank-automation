package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LoginPage extends BasePage {

        public LoginPage(){
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(id="user_login")
        public WebElement userName;



        @FindBy(id="user_password")
        public WebElement password;

        @FindBy(name = "submit")
        public WebElement submit;

        @FindBy(xpath = "//div[@class='alert alert-error']")
        static WebElement WrongPasswordDisplayed;

        public void login(String userNameStr, String passwordStr) {
            userName.sendKeys(userNameStr);
            password.sendKeys(passwordStr);
            submit.click();
            // verification that we logged
        }


    }


