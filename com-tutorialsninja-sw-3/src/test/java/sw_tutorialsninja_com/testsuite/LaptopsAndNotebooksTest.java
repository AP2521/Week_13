package sw_tutorialsninja_com.testsuite;

import org.testng.annotations.Test;
import sw_tutorialsninja_com.browserfactory.TestBase;
import sw_tutorialsninja_com.pages.ProductPageandOrder;
import sw_tutorialsninja_com.pages.TopMenuPage;

public class LaptopsAndNotebooksTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();
    ProductPageandOrder productPageandOrder = new ProductPageandOrder();

    @Test
    public void laptopsandnotebooksTest () {
        topMenuPage.selectMenu("Laptops & Notebooks","Show AllLaptops & Notebooks");
        productPageandOrder.setSortBy("Price (High > Low)");
        productPageandOrder.selectProduct("MacBook");
        productPageandOrder.verifyProductText("MacBook");
        productPageandOrder.AddtoCart();
        productPageandOrder.clickonShoppingCart();
        productPageandOrder.verifyProductTextinCart("MacBook");
        productPageandOrder.verifyModel("Product 16");
        productPageandOrder.enterUpdateQTYinCartandVerify("2","Success: You have modified your shopping cart!\n"+"×");
        productPageandOrder.currencyChange("£Pound Sterling");
        productPageandOrder.verifyTotalAmount("£737.45");
    }
}
