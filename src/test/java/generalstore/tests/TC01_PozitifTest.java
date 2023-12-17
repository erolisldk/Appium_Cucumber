package generalstore.tests;


import generalstore.pages.FormSayfasi;
import generalstore.pages.SepetSayfasi;
import generalstore.pages.UrunKatalogSayfasi;
import org.testng.annotations.Test;



public class TC01_PozitifTest {
    @Test
    public void testGeneralStore() {
        FormSayfasi formSayfasi = new FormSayfasi();
        formSayfasi.ulkeSec("Austria");
        formSayfasi.isimGir("Safinaz");
        formSayfasi.cinsiyetSec("FEMALE");
        formSayfasi.letsShopButonunaTikla();

        UrunKatalogSayfasi urunKatalogSayfasi = new UrunKatalogSayfasi();
        urunKatalogSayfasi.sepeteUrunEkle("Converse All Star", 1);
        urunKatalogSayfasi.sepeteUrunEkle("LeBron Soldier 12 ", 1);
        urunKatalogSayfasi.sepeteGit();

        SepetSayfasi sepetSayfasi = new SepetSayfasi();
        sepetSayfasi.secilenUrunAdediniDogrula(2);
        sepetSayfasi.secilenUrunlerinToplamFiyatiniDogrula();
        sepetSayfasi.kontrolKutusunaTikla();
        sepetSayfasi.satinAlmaButonunaTikla();





////        for (WebElement w:products) {
////            String priceText = w.getText();
////            double price = Double.parseDouble(priceText.substring(1));
////            total += price;
////        }

//


//        bekle(5);
//
//        //Hibrit Uygulama
//        // Sadece Web context'inin değerini alabilmek için bu kodu yazmaya ihtiyacım var.
////        Set<String> contextHandles = driver.getContextHandles();
////        for (String contextName:contextHandles){
////            System.out.println(contextName);
////        }
//
//        driver.context("WEBVIEW_com.androidsample.generalstore");
//
//        //Arama motoru
//        driver.findElement(By.name("q")).sendKeys("Temel Reis", Keys.ENTER);
//
//        //Native Uygulama
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//        driver.context("NATIVE_APP");
//
//        // Başlık Doğrulaması
//        String baslik = driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/toolbar_title")).getText();
//        Assert.assertEquals(baslik, "General Store");
//
//        bekle(5);

    }
}
