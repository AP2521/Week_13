package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.By;

public class DurationOfStayPage extends Utility {
    By nextButton = By.xpath("(//button[@type='submit'])[4]");

    public void selectImmigrationStatus(String value) {
//        getElementsListandClick(familyImmigrationStatus,status);

        switch (value){
            case "6 months or less":
                clickOnElement(By.xpath("(//div[@class='govuk-radios']/div/label)[1]"));
                break;
            case "longer than 6 months":
                clickOnElement(By.xpath("(//div[@class='govuk-radios']/div/label)[2]"));
                break;
            default:
                break;
        }
    }
    public void clickNextStepButton(){clickOnElement(nextButton);}
}


