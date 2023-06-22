package parabank.pages;

import parabank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Bhavesh
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink(){
        Reporter.log("Click on Login Link" +loginLink.toString()+"<br>");
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        //Reporter.log("Click on Register Link" +registerLink.toString()+"<br>");
        clickOnElement(registerLink);

    }



}
