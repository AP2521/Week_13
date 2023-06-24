package uklibrary.pages;

import org.openqa.selenium.By;
import uklibrary.utility.Utility;

/**
 * Created by Anish
 */
public class HomePage extends Utility {

   By JobTitle = By.id("keywords");
   By Location = By.id("location");
   By Distance = By.xpath("//select[@id='distance']");
   By MoreSearchOption = By.id("toggle-hp-search");
   By SalaryMin = By.id("salarymin");
   By SalaryMax = By.id("salarymax");
   By SalaryType = By.xpath("//select[@id='salarytype']");
   By JobType = By.id("tempperm");
   By FindJobs = By.id("hp-search-btn");

   public void enterJobTitle(String jobTitle){
       sendTextToElement(JobTitle,jobTitle);
   }
   public void enterLocation(String location){
       sendTextToElement(Location,location);
   }
   public void selectDistance(String distance){
       selectByVisibleTextFromDropDown(Distance,distance);
   }
   public void clickOnMoreSearchOptionLink(){
       clickOnElement(MoreSearchOption);
   }
   public void enterMinSalary(String salaryMin){
       sendTextToElement(SalaryMin,salaryMin);
   }
   public void enterMaxSalary(String salaryMax){
       sendTextToElement(SalaryMax,salaryMax);
   }
   public void selectSalaryType(String salaryType){
       selectByVisibleTextFromDropDown(SalaryType,salaryType);
   }
   public void selectJobType(String jobType){
       selectByVisibleTextFromDropDown(JobType,jobType);
   }
   public void clickOnFindJobsButton(){
       clickOnElement(FindJobs);
   }


}
