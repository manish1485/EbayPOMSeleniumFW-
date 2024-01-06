package com.abc.tests;

import com.abc.lib.AppLib;
import com.abc.pages.Ebay_Advanced_Search_Page;
import com.abc.pages.Ebay_Search_Results_Page;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AbstractBaseTest {

    ChromeDriver driver;
    private AppLib app;

    @Parameters("browser")
    @BeforeMethod (alwaysRun = true)

    public void setup(@Optional("Chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            FirefoxDriver driver=new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        app=new AppLib(driver);
    }
    public AppLib getApp() {
        return app;
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }
}
