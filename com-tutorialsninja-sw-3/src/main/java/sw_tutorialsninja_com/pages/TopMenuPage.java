package sw_tutorialsninja_com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import sw_tutorialsninja_com.utility.Utility;

import java.util.List;

public class TopMenuPage extends Utility {

    By MenuBar = By.xpath("//ul[@class='nav navbar-nav']/li");
    By TabName = By.xpath("//div[@class='dropdown-menu']/a");
    By VerifyText = By.xpath("//div[@id='content']/h2");

    public void selectMenu(String menu, String menuItem)  {
        getElementsListandClick(MenuBar, menu);

        selectMenuContent(menuItem);
        verifyText(menu,VerifyText);
    }
        public void selectMenuContent(String menuItem) {
        List<WebElement> topMenuList = driver.findElements(TabName);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menuItem)) {
                    element.click();
                }
            }}
        catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(TabName);
        }

    }
}
