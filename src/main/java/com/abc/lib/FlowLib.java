package com.abc.lib;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class FlowLib {

    private ChromeDriver driver;

    public FlowLib(ChromeDriver driver){
        this.driver=driver;
    }

    public String getCurrentPageUrl(){
        return this.driver.getCurrentUrl();
    }

    public String getCurrentPageTitle(){
        return this.driver.getTitle();
    }

}
