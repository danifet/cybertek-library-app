package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.CybertekLibraryLoginPage;
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
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.sighInButton.click();

        BrowserUtils.sleep(1);

        String expectedTitle = "Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
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


    @When("user enters student <username>")
    public void userEntersStudentUsername(String username) {
        CybertekLibraryLoginPage cybertekLibraryLoginPage = new CybertekLibraryLoginPage();
        cybertekLibraryLoginPage.inputEmail.sendKeys(username);
    }

}
