package com.abc.pages;

import com.abc.elements.Ebay_AdvancePage_Search_Elements;
import com.abc.elements.Ebay_Search_Results_Page_Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ebay_Advanced_Search_Page {

    String pageUrl="https://www.ebay.com/";
    ChromeDriver driver;
    Ebay_Search_Results_Page_Elements search_results_elements;
    Ebay_AdvancePage_Search_Elements advancePage_search_elements;


    public Ebay_Advanced_Search_Page(ChromeDriver driver) {
        this.driver = driver;
        search_results_elements = new Ebay_Search_Results_Page_Elements(driver);
        advancePage_search_elements = new Ebay_AdvancePage_Search_Elements(driver);
    }
    public String toGetThePageUrl() {
        return pageUrl;
    }
    /*
    To check advance search button is enabled or not
     */
    public boolean isAdvanceSearchButtonEnabled() {
        return advancePage_search_elements.advSearchBtn.isEnabled();
    }

    /*
  To click on  advance search button
   */
    public void clickAdvanceSearchButton() {
        advancePage_search_elements.advSearchBtn.click();
    }
    /*
 To check search button is enabled or not
  */
    public boolean isSearchButtonEnabled() {
        return advancePage_search_elements.searchBtn.isEnabled();
    }

    /*
    To click on Home breadCrumb link
     */
    public void clickHomeBreadCrumbLinkEnabled() {
        advancePage_search_elements.homeBreadcrumbLink.click();
    }

    //To click on  search button
    public void clickSearchButton() {
        advancePage_search_elements.searchBtn.click();
    }
    /*
 To get all categories option
  */
    public List<WebElement> allCategoriesOption()  {
       return advancePage_search_elements.allCatSelectBoxOptions;
    }
    /*
 Enter Search String in keywords field
  */
    public void enterSearchStringInKeywordField(String srcString)  {
        advancePage_search_elements.keywordsTxtbox.sendKeys(srcString);
    }

}
