package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginWithParameters {
    public LoginWithParameters() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_count")

    public WebElement userCount;




}
