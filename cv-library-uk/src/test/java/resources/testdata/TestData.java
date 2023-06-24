package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name="logindata")
    public Object[][] getData() {

        Object[][] data = new Object[][]{

                {"jobTitle", "Tester"},
                {"location", "Harrow"},
                {"distance", "up to 5 miles"},
                {"salaryMin","30000"},
                {"salaryMax","500000"},
                {"salaryType","Per annum"},
                {"jobType","Permanent"},
                {"result","Permanent Tester jobs in Harrow"}
        };
        return data;
    }

}
