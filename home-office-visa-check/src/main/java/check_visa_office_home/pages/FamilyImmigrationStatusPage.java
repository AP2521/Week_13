package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.By;

public class FamilyImmigrationStatusPage extends Utility {

  //  By familyImmigrationStatus = By.xpath("(//div[@class='govuk-radios']/div/label)[1]");
    By nextButton = By.xpath("(//button[@type='submit'])[4]");

    public void selectImmigrationStatus(String value) {
//        getElementsListandClick(familyImmigrationStatus,status);
//        clickOnElement(nextButton);
        switch (value){
            case "Yes":
                clickOnElement(By.xpath("(//div[@class='govuk-radios']/div/label)[1]"));
                break;
            case "No":
                clickOnElement(By.xpath("(//div[@class='govuk-radios']/div/label)[2]"));
                break;
            default:
                break;
        }
    }
    public void clickNextStepButton(){clickOnElement(nextButton);}
}