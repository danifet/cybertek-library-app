package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithParameters {
    public LoginWithParameters() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user_count")

    public WebElement userCount;

    @FindBy (xpath = "//a[@id = 'navbarDropdown']/span")

    public WebElement accountName;






}
