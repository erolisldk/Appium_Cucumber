package pointr_maps.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pointr_maps.utils.Driver;
import pointr_maps.utils.ReusableMethods;



public class commonSentences extends ReusableMethods {
    public commonSentences() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(className = "android.widget.TextView")
    public WebElement othaimMall;

    @AndroidFindBy(accessibility = "Start")
    public WebElement startButton;

    @AndroidFindBy(className = "android.widget.TextView")
    public WebElement levelSelector;

    @AndroidFindBy(id = "com.pointrlabs.demo.uatapi.prod:id/walkthrough_next_button")
    public WebElement nextStep1;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement locationPermisson;

    @AndroidFindBy(className = "android.widget.TextView")
    public WebElement permissionButton;

    @AndroidFindBy(className = "android.widget.LinearLayout")
    public WebElement locationButton;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/allow_always_radio_button")
    public WebElement allowAllTime;

    @AndroidFindBy(accessibility = "Back")
    public WebElement backButton;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public WebElement allowButton;

    @AndroidFindBy(id = "com.pointrlabs.demo.uatapi.prod:id/searchViewEt")
    public WebElement searchInput;


}
