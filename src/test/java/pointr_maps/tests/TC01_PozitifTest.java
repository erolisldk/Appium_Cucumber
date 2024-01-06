package pointr_maps.tests;

import pointr_maps.pages.FormSayfasi;
import pointr_maps.pages.SepetSayfasi;
import pointr_maps.pages.SiparisTamamlamaSayfasi;
import pointr_maps.pages.UrunKatalogSayfasi;
import org.testng.annotations.Test;

import static pointr_maps.utils.Driver.closeApp;

public class TC01_PozitifTest {
    @Test
    public void tc01PozitifTest() {
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

        SiparisTamamlamaSayfasi siparisTamamlamaSayfasi = new SiparisTamamlamaSayfasi();
        siparisTamamlamaSayfasi.aramaMotorundaAra("Temel Reis");
        siparisTamamlamaSayfasi.uygulamayaGeriDon();

        formSayfasi.sayfaBasliginiDogrula();
        closeApp();

    }
}
