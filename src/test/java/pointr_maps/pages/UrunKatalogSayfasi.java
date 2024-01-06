package pointr_maps.pages;

import pointr_maps.utils.Driver;
import pointr_maps.utils.ReusableMethods;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static pointr_maps.utils.Driver.driver;
import static pointr_maps.utils.ExtentReport.info;

public class UrunKatalogSayfasi extends ReusableMethods {
    public UrunKatalogSayfasi() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"ADD TO CART\"]")
    private List<WebElement> addToCart;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement sepeteGit;

    public void sepeteUrunEkle(String urun, int index){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+urun+"\"))"));
        addToCart.get(index).click();
        info(urun + " ürünü sepete eklendi.");
    }

    public void sepeteGit(){
        sepeteGit.click();
        info("Sepet butonuna tıklanarak Sepet sayfasına gidildi.");
    }

}
