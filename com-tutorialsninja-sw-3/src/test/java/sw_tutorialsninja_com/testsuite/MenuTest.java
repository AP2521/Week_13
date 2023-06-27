package sw_tutorialsninja_com.testsuite;

import org.testng.annotations.Test;
import sw_tutorialsninja_com.browserfactory.TestBase;
import sw_tutorialsninja_com.pages.ProductPageandOrder;
import sw_tutorialsninja_com.pages.TopMenuPage;

public class MenuTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();
    ProductPageandOrder productPageandOrder = new ProductPageandOrder();
    @Test
    public void menuTest(){
        topMenuPage.selectMenu("Desktops","Show AllDesktops");
        topMenuPage.selectMenu("Laptops & Notebooks","Show AllLaptops & Notebooks");
        topMenuPage.selectMenu("Components","Show AllComponents");
    }

}
