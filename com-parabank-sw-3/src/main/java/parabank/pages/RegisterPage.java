package parabank.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;
import parabank.utility.Utility;

public class RegisterPage extends Utility {
    By FirstName = By.id("customer.firstName");
    By LastName = By.id("customer.lastName");
    By AddressStreet = By.id("customer.address.street");
    By AddressCity = By.id("customer.address.city");
    By AddressState = By.id("customer.address.state");
    By AddressZipcode = By.id("customer.address.zipCode");
    By PhoneNumber = By.id("customer.phoneNumber");
    By SSN = By.id("customer.ssn");
    By Username = By.id("customer.username");
    By Password = By.id("customer.password");
    By ConfirmPassword = By.id("repeatedPassword");
    By RegisterButton = By.xpath("//input[@value='Register']");
    By AccountCreatedText = By.xpath("//div[@id='rightPanel']/p");

    public void EnterFirstName(String firstname){
        Reporter.log("Enter FristName"+firstname.toString());
        sendTextToElement(FirstName,firstname);
    }
    public void EnterLastNAme(String lastname){
        Reporter.log("Enter Last Name"+lastname.toString());
        sendTextToElement(LastName,lastname);
    }
    public void EnterAddressStreet(String addressStreet){
        Reporter.log("Enter AddressStreet"+addressStreet.toString());
        sendTextToElement(AddressStreet,addressStreet);
    }
    public void EnterAddressCity(String addressCity){
        Reporter.log("Enter addressCity"+addressCity.toString());
        sendTextToElement(AddressCity,addressCity);
    }
    public void EnterAddressState(String addressState){
        Reporter.log("Enter addressState"+addressState.toString());
        sendTextToElement(AddressState,addressState);
    }
    public void AddressZipcode(String addressZipcode){
        Reporter.log("Enter addressZipcode"+addressZipcode.toString());
        sendTextToElement(AddressZipcode,addressZipcode);
    }
    public void PhoneNumber(String phoneNumber){
        Reporter.log("Enter phoneNumber"+phoneNumber.toString());
        sendTextToElement(PhoneNumber,phoneNumber);
    }
    public void EnterUsername(String username){
        Reporter.log("Enter Username"+username.toString());
        sendTextToElement(Username,username);
    }
    public void EnterSSN(String ssn){
        Reporter.log("Enter ssn"+ssn.toString());
        sendTextToElement(SSN,ssn);
    }

    public void EnterPassword(String password){
        Reporter.log("Enter password"+password.toString());
        sendTextToElement(Password,password);
    }
    public void EnterConfirmPassword(String confirmPassword){
        Reporter.log("Enter confirmPassword"+confirmPassword.toString());
        sendTextToElement(ConfirmPassword,confirmPassword);
    }
    public void ClickRegisterButton(){
        clickOnElement(RegisterButton);
    }
    public void VerifyAccountCreatedText(String expected){
       verifyText(expected,AccountCreatedText);
    }

}
