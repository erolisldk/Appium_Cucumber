package pointr_maps.hooks;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pointr_maps.utils.ConfigReader;
import pointr_maps.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
//     @BeforeAll
// public void beforeAll() {
//
// }
    @Before
    public void setUp() {
        Driver.startServer(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));


    }
    @After
    public void tearDown() {
        Driver.closeApp();
        Driver.closeServer();
    }
//    @AfterAll
//    public void afterAll() {
//
//    }
}
