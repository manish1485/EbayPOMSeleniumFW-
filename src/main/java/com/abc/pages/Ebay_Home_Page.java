package com.abc.pages;

import com.abc.elements.Ebay_Home_Page_Elements;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Home_Page {


    ChromeDriver driver;
    Ebay_Home_Page_Elements home_page_elements;

    public Ebay_Home_Page(ChromeDriver driver){
        this.driver=driver;
        home_page_elements=new Ebay_Home_Page_Elements(driver);
    }
    /*
    Click Search button
     */

    public void clickSearchButton(){
        home_page_elements.searchBtn.click();
    }
}

