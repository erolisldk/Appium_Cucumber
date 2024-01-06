package pointr_maps.pages;

import org.testng.annotations.Test;

import static pointr_maps.utils.Driver.closeApp;
import static pointr_maps.utils.Driver.closeApp;

public class TC02_NegatifTest {
    @Test
    public void tc02NegatifTest() {
        FormSayfasi formSayfasi = new FormSayfasi();
        formSayfasi.letsShopButonunaTikla();
        formSayfasi.hataMesajininGorundugunuDogrula("Please enter your name");
        closeApp();
    }
}
