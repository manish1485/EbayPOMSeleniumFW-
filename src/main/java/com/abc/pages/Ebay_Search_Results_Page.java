package com.abc.pages;

import com.abc.elements.Ebay_Search_Results_Page_Elements;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Search_Results_Page {
    ChromeDriver driver;
    Ebay_Search_Results_Page_Elements search_results_elements;

    public Ebay_Search_Results_Page(ChromeDriver driver){
        this.driver=driver;
        search_results_elements=new Ebay_Search_Results_Page_Elements(driver);
    }
    /*
    Get First Result Title
     */
    public  String getFirstResultTitle(){
        return search_results_elements.firstSearchResult.getText().trim();

    }
}
