package pointr_maps.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pointr_maps.pages.commonSentences;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pointr_maps.utils.ReusableMethods;

import static pointr_maps.utils.Driver.driver;
import static pointr_maps.utils.ExtentReport.info;

public class MyStepdefs extends ReusableMethods {

    public commonSentences commonSentences = new commonSentences();
    @Given("user navigates to {string}")
    public void userNavigatesTo(String othaimMall) {

        commonSentences.nextStep1.click();
        commonSentences.nextStep1.click();
        commonSentences.nextStep1.click();
        //commonSentences.locationPermisson.click();
        commonSentences.nextStep1.click();
        //commonSentences.permissionButton.click();
        //commonSentences.locationButton.click();
        // commonSentences.allowAllTime.click();
        // commonSentences.backButton.click();
        // commonSentences.backButton.click();
        //  commonSentences.backButton.click();
        commonSentences.nextStep1.click();
        commonSentences.nextStep1.click();
        // commonSentences.allowButton.click();
        commonSentences.nextStep1.click();
       commonSentences.nextStep1.click();

        //commonSentences.othaimMall.click();
      //  commonSentences.startButton.click();
    //wait(25);
    }

    @Given("I should see {string} text in the {string}")
    public void iShouldSeeTextInThe(String Level, String levelSelector) {
        wait(10);
       Assert.assertTrue(commonSentences.levelSelector.isDisplayed());
       wait(10);

    }

    @When("I type {string} into {string}")
    public void iTypeInto(String text, String searchInput) {

        commonSentences.searchInput.sendKeys(text);
        commonSentences.searchInput.click();
        wait(5);
    }

    @Then("I click on {string}")
    public void iClickOn(String firstResult) {
        commonSentences.firstResult.click();
    }

    @And("{string} should be displayed")
    public void shouldBeDisplayed(String text) {
        Assert.assertTrue(commonSentences.directionButton.isDisplayed());
    }
}
