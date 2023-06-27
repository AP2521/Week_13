package sw_tutorialsninja_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import sw_tutorialsninja_com.utility.Utility;

import java.util.List;

public class ProductPageandOrder extends Utility {
    By sortBy = By.xpath("//select[@id='input-sort']");
    By productList = By.xpath("//div[@class='caption']/h4/a");
    By verifyProductText = By.xpath("//div[@class='col-sm-4']/h1");
    By deliveryDate = By.id("input-option225");
    By quantity = By.xpath("//input[@name='quantity']");
    By enterQtyinCart = By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input");
    By updateQty = By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[1]");
    By verifySuccessModified = By.xpath("//div[@id='checkout-cart']/div[1]");
    By addCartButton = By.xpath("//button[@id='button-cart']");
    By shoppingCart = By.linkText("shopping cart");
    By verifyShopping = By.xpath("//*[@id='checkout-cart']/ul/li[2]/a");
    By currencyButton = By.xpath("//*[@id='form-currency']/div/ul/li/button");
    By totalAmount = By.xpath("(//table[@class='table table-bordered']/tbody/tr[4]/td[2])[2]");

    public void setSortBy(String sortby) {
        selectByVisibleTextFromDropDown(sortBy, sortby);
        //verifyText(sortby, sortBy);
    }
    public void selectProduct(String Product) {
        List<WebElement> topMenuList = driver.findElements(productList);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(Product)) {
                    element.click();
                }
            }}
        catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(productList);
        }
    }
    public void verifyProductText(String product){
        Reporter.log("Verify Product"+ product.toString());
        verifyText(product, verifyProductText);
   }

    public void selectDeliverDate(String YMD) {
        clearSendTextToElement(deliveryDate,YMD);
    }
    public void enterQuantity(String qty){
        clearSendTextToElement(quantity,qty);
    }
    public void AddtoCart(){
        clickOnElement(addCartButton);
    }
    public void clickonShoppingCart(){
        clickOnElement(shoppingCart);
        verifyText("Shopping Cart",verifyShopping);
    }
    public void verifyProductTextinCart(String productName){
        verifyText(productName,By.xpath("//div/table/tbody/tr/td[2]/a"));}
        public void verifyDeliveryDate(String deliveryDate){
        verifyText(deliveryDate,By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[2]/small[1]"));}
        public void verifyModel(String modelNo){
        verifyText(modelNo,By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[3]"));
    }
    public void enterUpdateQTYinCartandVerify(String Qty,String verifyModification){
        clearSendTextToElement(enterQtyinCart,Qty);
        clickOnElement(updateQty);
        verifyText(verifyModification,verifySuccessModified);
    }

    public void currencyChange(String enterCurrency){
        clickOnElement(By.xpath("//form[@id='form-currency']/div/button/span"));
        //getElementsListandClick(By.xpath("//*[@id='form-currency']/div/ul/li/button"),enterCurrency);
        List<WebElement> topMenuList = driver.findElements(currencyButton);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(enterCurrency)) {
                    element.click();
                }
            }}
        catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(currencyButton);
        }
    }
    public void verifyTotalAmount(String EnterTotalamount){
        verifyText(EnterTotalamount,totalAmount);
    }
}