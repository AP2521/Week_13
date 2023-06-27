package parabank.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import parabank.browserfactory.TestBase;
import parabank.pages.HomePage;
import parabank.pages.RegisterPage;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test (groups = "smoke")
    public void verifyThatSigningUpPageDisplay() {
        homePage.clickOnRegisterLink();
        verifyText("Signing up is easy!", By.cssSelector("div[id='rightPanel']>h1"));
    }

    @Test (groups = {"sanity","regression"})
    public void userSholdRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.EnterFirstName("Anish");
        registerPage.EnterLastNAme("patel");
        registerPage.EnterAddressStreet("123phx");
        registerPage.EnterAddressCity("Phoenix");
        registerPage.EnterAddressState("AZ");
        registerPage.AddressZipcode("85035");
        registerPage.PhoneNumber("123456789");
        registerPage.EnterSSN("12345678");
        registerPage.EnterUsername("ab13345");
        registerPage.EnterPassword("ab133");
        registerPage.EnterConfirmPassword("ab133");
        registerPage.ClickRegisterButton();
        registerPage.VerifyAccountCreatedText("Your account was created successfully. You are now logged in.");

    }
}
