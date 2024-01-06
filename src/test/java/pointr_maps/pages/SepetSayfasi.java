package pointr_maps.pages;

import pointr_maps.utils.Driver;
import pointr_maps.utils.ReusableMethods;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static pointr_maps.utils.Driver.driver;
import static pointr_maps.utils.ExtentReport.info;

public class SepetSayfasi extends ReusableMethods {
    public SepetSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")
    private List<WebElement> urunler;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")
    private WebElement toplamFiyat;
    @AndroidFindBy(className = "android.widget.CheckBox")
    private WebElement kontrolKutusu;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
    private WebElement satinAlmaButonu;


    public void secilenUrunAdediniDogrula(int urunAdedi) {
        Assert.assertEquals(urunler.size(), urunAdedi);
        info("Seçilen ürün adedinin " +urunAdedi+ " olduğu doğrulandı.");
    }

    public void secilenUrunlerinToplamFiyatiniDogrula() {
        double total = 0;
        for (int i = 0; i < urunler.size(); i++) {
            String priceText = urunler.get(i).getText();
            double price = Double.parseDouble(priceText.substring(1));
            total += price;
        }

        double totalAmount = Double.parseDouble(toplamFiyat.getText().substring(1));
        Assert.assertEquals(total, totalAmount);
        info("Seçilen ürünlerin toplam fiyatı ile, Total Amount fiyatının aynı olduğu doğrulandı.");
    }

    public void kontrolKutusunaTikla() {
        kontrolKutusu.click();
        info("Send me email.. mesajlı kontrol kutusu seçildi.");
    }

    public void satinAlmaButonunaTikla() {
        satinAlmaButonu.click();
        wait(5);
        driver.context("WEBVIEW_com.androidsample.generalstore");
        info("Satın Al butonuna tıklandı.");
    }

}
