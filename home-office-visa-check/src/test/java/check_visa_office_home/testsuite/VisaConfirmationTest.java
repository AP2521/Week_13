package check_visa_office_home.testsuite;

import check_visa_office_home.browserfactory.TestBase;
import check_visa_office_home.pages.*;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

StartPage startPage =new StartPage();
WorkTypePage workTypePage = new WorkTypePage();
SelectNationalityPage selectNationalityPage = new SelectNationalityPage();
ResultPage resultPage = new ResultPage();
ReasonForTravelPage reasonForTravelPage = new ReasonForTravelPage();
FamilyImmigrationStatusPage familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
DurationOfStayPage durationOfStayPage = new DurationOfStayPage();

@Test
    public void anAustralianCominToUKForTourism() throws InterruptedException {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clickNextStepButton();
        Thread.sleep(5000);
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");
    }
    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectImmigrationStatus("longer than 6 months");
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickNextStepButton();
        resultPage.confirmResultMessage("You need a visa to work in health and care");
    }
    @Test
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("India");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickNextStepButton();
        familyImmigrationStatusPage.selectImmigrationStatus("Yes");
        familyImmigrationStatusPage.clickNextStepButton();
        resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");
    }
}
