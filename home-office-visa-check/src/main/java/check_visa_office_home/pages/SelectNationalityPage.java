package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.By;

public class SelectNationalityPage extends Utility {

    By nationalityList = By.id("response");
    By continueButton = By.xpath("(//button[@type='submit'])[4]");


    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(nationalityList,nationality);
    }
    public void clickNextStepButton(){clickOnElement(continueButton);}
}
