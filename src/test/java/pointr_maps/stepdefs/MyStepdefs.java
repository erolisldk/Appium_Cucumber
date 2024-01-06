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
        commonSentences.nextStep1.click();

        commonSentences.othaimMall.click();
        wait(5);

        commonSentences.startButton.click();

        wait(20);

        info("user navigates to" + othaimMall);

    }

    @Given("I should see {string} text in the {string}")
    public void iShouldSeeTextInThe(String GF, String levelSelector) {
       Assert.assertTrue(commonSentences.levelSelector.isDisplayed());
       Assert.assertEquals(GF, commonSentences.levelSelector);
    }

    @When("I type {string} into {string}")
    public void iTypeInto(String text, String searchInput) {
        commonSentences.searchInput.sendKeys();
    }
}
