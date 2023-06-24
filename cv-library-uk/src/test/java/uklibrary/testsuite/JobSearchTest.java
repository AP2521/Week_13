package uklibrary.testsuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import uklibrary.pages.HomePage;
import uklibrary.pages.ResultPage;
import uklibrary.testbase.TestBase;

public class JobSearchTest extends TestBase {
        HomePage homePage=new HomePage();
        ResultPage resultPage=new ResultPage();

@Test @Parameters({"jobTitle","location","distance","salaryMin","salaryMax","salaryType","jobType","result"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result){
                homePage.enterJobTitle(jobTitle);
                homePage.enterLocation(location);
                homePage.selectDistance(distance);
                homePage.clickOnMoreSearchOptionLink();
                homePage.enterMinSalary(salaryMin);
                homePage.enterMaxSalary(salaryMax);
                homePage.selectSalaryType(salaryType);
                homePage.selectJobType(jobType);
                homePage.clickOnFindJobsButton();
                resultPage.verifyResultPageText(result);

    }
}
