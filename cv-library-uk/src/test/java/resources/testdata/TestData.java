package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name="logindata")
    public Object[][] getData() {

        Object[][] data = new Object[][]{

                { "Tester","Harrow", "5 miles","30000",
                "500000",
                "Per annum",
                "Permanent",
                "Permanent Tester jobs in Harrow"}
        };
        return data;
    }

}
