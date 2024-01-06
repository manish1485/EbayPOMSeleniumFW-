package com.abc.tests;

import com.abc.elements.Ebay_AdvancePage_Search_Elements;
import com.abc.elements.Ebay_Home_Page_Elements;
import com.abc.elements.Ebay_Search_Results_Page_Elements;
import com.abc.lib.AppLib;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebay_Home_Page extends AbstractBaseTest {

    @Test (groups = "p1")
    public void empty_URL_Check() throws InterruptedException {

        String currentUrl = getApp().getFlow().getCurrentPageUrl();
        String newTitle = getApp().getFlow().getCurrentPageTitle();
        System.out.println("newTitle = " + newTitle);
        System.out.println("currentUrl = " + currentUrl);
    }


}