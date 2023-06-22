package parabank.pages;

import org.openqa.selenium.By;
import parabank.utility.Utility;

/**
 * Created by Anish
 */
public class LoginPage extends Utility {

    By UserName = By.xpath("//input[@name='username']");
    By Password = By.xpath("//input[@name='password']");
    By LoginButton = By.xpath("//input[@value='Log In']");
    By VerifyText = By.xpath("//h1[@class='title']");
    By ErrorText = By.xpath("//p[@class='error']");
    By Logout = By.xpath("//div[@id='leftPanel']/ul/li[8]/a");
    By CustomerLogin = By.xpath("//div[@id='leftPanel']/h2");

    public void EnterUserName(String name){
        sendTextToElement(UserName,name);
    }
    public void EnterPassword(String password){
        sendTextToElement(Password,password);
    }
    public void ClickLogin(){
        clickOnElement(LoginButton);
    }
    public void VerifyText(String expected){
        verifyText(expected,VerifyText);
    }
    public void VerifyErrorText(String expected){
        verifyText(expected,ErrorText);
    }
    public void LogOutButton(){clickOnElement(Logout);}
    public void VerifyLoginText(String expected){
        verifyText(expected,CustomerLogin);
    }
}
