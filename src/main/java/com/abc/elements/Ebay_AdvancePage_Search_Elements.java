package com.abc.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Ebay_AdvancePage_Search_Elements {

   ChromeDriver driver;

    @FindBy(css = "#gh-as-a")
    public WebElement advSearchBtn;
    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement homeBreadcrumbLink;
    @FindBy(css = "#_nkw")
    public WebElement keywordsTxtbox;
    @FindBy(xpath = "//div[@class='field adv-keywords__btn-help']//button[@type='submit'][normalize-space()='Search']")
    public WebElement searchBtn;

    @FindBy(id = "s0-1-17-4[0]-7[3]-_sacat")
    public List<WebElement> allCatSelectBoxOptions;

 /*   public Ebay_AdvancePage_Search(ChromeDriver driver) {
    }*/

    public Ebay_AdvancePage_Search_Elements(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
