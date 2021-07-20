package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.CybertekLibraryLoginPage;
import com.cybertek.library.pages.LoginWithParameters;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {

        BrowserUtils.sleep(1);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String expectedTitle = "Login - Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("user enters librarian username")
    public void userEntersLibrarianUsername() {

        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("librarianEmail"));
    }


    @And("user enters librarian password")
    public void userEntersLibrarianPassword() {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
    }


    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {
        BrowserUtils.sleep(1);

        String expectedTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        Driver.closeDriver();
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("studentEmail"));
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("studentPassword"));
    }


    @When("user enters librarian username {string}")
    public void userEntersLibrarianUsername(String arg0) {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputEmail.sendKeys(arg0);
    }


    @And("user enters librarian password {string}")
    public void userEntersLibrarianPassword(String arg0) {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputPassword.sendKeys(arg0);
    }


    @And("click the sign in button")
    public void clickTheSignInButton() {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.sighInButton.click();
    }


    @When("user enters student username {string}")
    public void userEntersStudentUsername(String arg0) {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputEmail.sendKeys(arg0);
    }

    @And("user enters student password {string}")
    public void userEntersStudentPassword(String arg0) {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputPassword.sendKeys(arg0);
    }

    @And("there should be {int} users")
    public void thereShouldBeUsers(int arg0) {
        LoginWithParameters loginWithParameters = new LoginWithParameters();
        String actualCount = loginWithParameters.userCount.getText();
        String expectedCount = String.valueOf(arg0);

        Assert.assertEquals(actualCount,expectedCount);
    }

    @When("User login using {string} and {string}")
    public void userLoginUsingAnd(String arg0, String arg1) {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputEmail.sendKeys(arg0);
        cybertekLibraryLoginPage.inputPassword.sendKeys(arg0);
        cybertekLibraryLoginPage.sighInButton.click();

    }


}
