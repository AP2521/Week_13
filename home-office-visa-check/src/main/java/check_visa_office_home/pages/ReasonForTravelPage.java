package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.By;

public class ReasonForTravelPage extends Utility {

    By reasonforTravelling = By.xpath("//div[@class='govuk-radios']/div/label");
    By nextButton = By.xpath("(//button[@type='submit'])[4]");
    public void selectReasonForVisit(String reason){
        getElementsListandClick(reasonforTravelling,reason);
    }
    public void clickNextStepButton(){clickOnElement(nextButton);}
}
