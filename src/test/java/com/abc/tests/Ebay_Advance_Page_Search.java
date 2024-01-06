package com.abc.tests;

import com.abc.elements.Ebay_AdvancePage_Search_Elements;
import com.abc.elements.Ebay_Home_Page_Elements;
import com.abc.elements.Ebay_Search_Results_Page_Elements;
import com.abc.pages.Ebay_Advanced_Search_Page;
import com.abc.pages.Ebay_Search_Results_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebay_Advance_Page_Search extends  AbstractBaseTest{


    @Test(groups = {"p1", "p2"})
    public void ebay_logo_link_navigates_home_page_test() throws InterruptedException {

        getApp().getPage().getAdvSearchPage().clickAdvanceSearchButton();
        String expectedUrl=getApp().getPage().getAdvSearchPage().toGetThePageUrl();
        String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
        getApp().getPage().getAdvSearchPage().clickHomeBreadCrumbLinkEnabled();

        String actualUrl=getApp().getFlow().getCurrentPageUrl();
        String actualTitle=getApp().getFlow().getCurrentPageTitle();

        System.out.println("actualUrl = " + actualUrl);
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(actualUrl, expectedUrl, "Verify Url of the new page");
        Assert.assertEquals(actualUrl, expectedUrl, "Verify title of the new page");
    }


    @Test(groups = {"p2"})
    public void ebay_advance_search_keyword_test() throws InterruptedException {

        getApp().getPage().getAdvSearchPage().clickAdvanceSearchButton();

        String keyword1="unlocked";
        String keyword2="ios";
        String searchString=keyword1 +" "+ keyword2;

        getApp().getPage().getAdvSearchPage().enterSearchStringInKeywordField(searchString);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Scroll down by a specific pixel value (e.g., 500 pixels)
        jsExecutor.executeScript("window.scrollBy(0, 500);");

        getApp().getPage().getAdvSearchPage().clickSearchButton();

        System.out.println("*******************");

       String firstResultTitle= getApp().getPage().getSearchResultsPage().getFirstResultTitle();

        System.out.println(getApp().getFlow().getCurrentPageTitle());
        System.out.println(getApp().getFlow().getCurrentPageUrl());
        Assert.assertTrue(firstResultTitle.toLowerCase().contains(keyword1),   keyword1);
        Assert.assertTrue(firstResultTitle.toLowerCase().contains(keyword2), keyword2 );
    }
}

