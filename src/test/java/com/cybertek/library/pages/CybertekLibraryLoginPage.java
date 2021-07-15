package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CybertekLibraryLoginPage {
    public CybertekLibraryLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "inputEmail")

    public WebElement inputEmail;

    @FindBy (id = "inputPassword")

    public WebElement inputPassword;

    @FindBy (className = "btn btn-lg btn-primary btn-block")

    public WebElement sighInButton;
}
