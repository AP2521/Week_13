package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ResultPage extends Utility {

    By resultPage = By.xpath("//div[@class='govuk-!-margin-bottom-6']/h2");

    public String getResultMessage(){
        String actualText = driver.findElement(resultPage).getText();
        return actualText;
    }
    public void confirmResultMessage(String expectedMessage){
        ResultPage resultPage = new ResultPage();
        String actualMessage = resultPage.getResultMessage();
        Assert.assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));

    }
}
