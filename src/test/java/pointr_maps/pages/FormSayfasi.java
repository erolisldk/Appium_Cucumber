package pointr_maps.pages;

import pointr_maps.utils.Driver;
import pointr_maps.utils.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static pointr_maps.utils.Driver.driver;
import static pointr_maps.utils.ExtentReport.info;

public class FormSayfasi extends ReusableMethods {
    public FormSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public WebElement ulkeMenusu;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public WebElement isimAlani;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
    public WebElement cinsiyetFemale;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
    public WebElement cinsiyetMale;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public WebElement letsShopButonu;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/toolbar_title")
    public WebElement sayfaBasligi;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private WebElement hataMesaji;

    public void ulkeSec(String ulke){
        ulkeMenusu.click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+ulke+"\"))"));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\""+ulke+"\"]")).click();
        info("Ülke menüsünden " + ulke + " ülkesi seçildi.");
    }

    public void isimGir(String isim){
        isimAlani.sendKeys(isim);
        info("İsim kutusuna " + isim + " ismi girildi.");
    }

    public void cinsiyetSec(String cinsiyet){
        if (cinsiyet.equalsIgnoreCase("female")){
            cinsiyetFemale.click();
        }else {
            cinsiyetMale.click();
        }
        info("Cinsiyet seçeneklerinden " + cinsiyet + " seçildi.");
    }

    public void letsShopButonunaTikla(){
        letsShopButonu.click();
        info("Let's Shop butonuna tıklandı.");
    }

    public void sayfaBasliginiDogrula(){
        Assert.assertEquals(sayfaBasligi.getText(), "General Store");
        info("Sayfa başlığının General Store olduğu doğrulandı.");
    }

    public void hataMesajininGorundugunuDogrula(String mesaj){
        Assert.assertEquals(hataMesaji.getAttribute("name"), mesaj);
        info("Hata mesajının " + mesaj +  " olduğu doğrulandı.");
    }



}
