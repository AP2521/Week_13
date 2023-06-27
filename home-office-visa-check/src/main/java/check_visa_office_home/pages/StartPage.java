package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.By;

public class StartPage extends Utility {

    By startButton = By.xpath("(//a[@role='button'])[1]");

    public void clickStartNow(){
        clickOnElement(startButton);
    }
}
