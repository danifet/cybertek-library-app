package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersLinkPage {

    public UsersLinkPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#users']")

    public WebElement userr;

    @FindBy (xpath = "//select[@name ='tbl_users_length' ]")

    public WebElement showDrop;

    @FindBy (xpath = "//th")

    public List<WebElement> tableHeaders;
}
