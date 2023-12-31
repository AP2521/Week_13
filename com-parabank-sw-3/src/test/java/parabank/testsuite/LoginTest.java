package parabank.testsuite;

import org.testng.annotations.Test;
import parabank.browserfactory.TestBase;
import parabank.pages.LoginPage;

public class LoginTest extends TestBase {
LoginPage loginPage = new LoginPage();

    @Test(groups = "smoke")
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.EnterUserName("ab13345");
        loginPage.EnterPassword("ab133");
        loginPage.ClickLogin();
        loginPage.VerifyText("Accounts Overview");
    }
    @Test(groups = "sanity")
    public void verifyTheErrorMessage(){
        loginPage.EnterUserName("a2345");
        loginPage.EnterPassword("a23");
        loginPage.ClickLogin();
        loginPage.VerifyText("Error!");
    }
    @Test (groups = "regression")
    public void userShouldLogOutSuccessfully(){
        loginPage.EnterUserName("ab13345");
        loginPage.EnterPassword("ab133");
        loginPage.ClickLogin();
        loginPage.LogOutButton();
        loginPage.VerifyLoginText("Customer Login");
    }
}
