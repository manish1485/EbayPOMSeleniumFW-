package com.abc.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Search_Results_Page_Elements {

    ChromeDriver driver;

    @FindBy(css = "li[id='item426872a5ff'] a[class='s-item__link'] span[class='BOLD']")
    public WebElement firstSearchResult;


    public Ebay_Search_Results_Page_Elements(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
