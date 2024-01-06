package pointr_maps.stepdefs;

import pointr_maps.pages.FormSayfasi;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.*;
import org.junit.Assert;

import static pointr_maps.utils.Driver.driver;

public class FormSayfasi_StepDefs {
    FormSayfasi formSayfasi = new FormSayfasi();

    @When("Ulke menusunden {string} secilir")
    public void ulkeMenusundenSecilir(String ulke) {
        formSayfasi.ulkeMenusu.click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + ulke + "\"))"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"" + ulke + "\"]")).click();
    }

    @And("İsim kutusuna {string} girilir")
    public void i̇simKutusunaGirilir(String isim) {
        formSayfasi.isimAlani.sendKeys(isim);
    }

    @And("Cinsiyet seceneklerinden {string} secilir")
    public void cinsiyetSeceneklerindenSecilir(String cinsiyet) {
        if (cinsiyet.equalsIgnoreCase("female")) {
            formSayfasi.cinsiyetFemale.click();
        } else {
            formSayfasi.cinsiyetMale.click();
        }
    }

    @When("Lets Shop butonuna tiklanir")
    public void lets_shop_butonuna_tiklanir() {
        formSayfasi.letsShopButonu.click();
    }

    @Then("Sayfa basliginin {string} oldugu dogrulanir")
    public void sayfa_basliginin_oldugu_dogrulanir(String baslik) {
        Assert.assertEquals(formSayfasi.sayfaBasligi.getText(), baslik);
    }
}




