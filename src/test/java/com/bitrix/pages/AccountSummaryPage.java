package com.bitrix.pages;

import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage extends BasePage{


    public AccountSummaryPage() {
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(css = "[title='Create Calendar event']")
        public WebElement createCalendarEvent;

    }

