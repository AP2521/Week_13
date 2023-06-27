package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.By;

public class WorkTypePage extends Utility {

    By jobTypeList = By.xpath("//div[@class='govuk-radios']/div/label");
    By nextButton = By.xpath("(//button[@type='submit'])[4]");
    public void selectJobType(String job){
        getElementsListandClick(jobTypeList,job);
    }
    public void clickNextStepButton(){clickOnElement(nextButton);}
}
