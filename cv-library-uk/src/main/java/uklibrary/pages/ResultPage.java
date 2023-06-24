package uklibrary.pages;

import org.openqa.selenium.By;
import uklibrary.utility.Utility;

public class ResultPage extends Utility {
    By VerifyResultpage= By.xpath("//h1[@class='search-header__title']");
    public void verifyResultPageText(String expected){
        verifyText(expected,VerifyResultpage);
    }
}
