package parabank.browserfactory;

import parabank.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import parabank.propertyreader.PropertyReader;

/**
 * Created by Bhavesh
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    //@Parameters("browser")
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
