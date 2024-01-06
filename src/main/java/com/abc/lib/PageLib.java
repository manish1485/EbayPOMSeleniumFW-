package com.abc.lib;

import com.abc.pages.Ebay_Advanced_Search_Page;
import com.abc.pages.Ebay_Search_Results_Page;
import org.openqa.selenium.chrome.ChromeDriver;
import com.abc.pages.Ebay_Home_Page;

public class PageLib {

    ChromeDriver driver;
    private Ebay_Home_Page ebay_home_page;
    private Ebay_Advanced_Search_Page advSearchPage;
    private Ebay_Search_Results_Page searchResultsPage;

    public PageLib(ChromeDriver driver){
        this.driver=driver;
        ebay_home_page = new com.abc.pages.Ebay_Home_Page(this.driver);
        advSearchPage = new Ebay_Advanced_Search_Page(this.driver);
        searchResultsPage = new Ebay_Search_Results_Page(this.driver);
    }

    public Ebay_Home_Page getEbay_home_page() {
        return ebay_home_page;
    }

    public void setEbay_home_page(Ebay_Home_Page ebay_home_page) {
        this.ebay_home_page = ebay_home_page;
    }

    public Ebay_Advanced_Search_Page getAdvSearchPage() {
        return advSearchPage;
    }

    public void setAdvSearchPage(Ebay_Advanced_Search_Page advSearchPage) {
        this.advSearchPage = advSearchPage;
    }

    public Ebay_Search_Results_Page getSearchResultsPage() {
        return searchResultsPage;
    }

    public void setSearchResultsPage(Ebay_Search_Results_Page searchResultsPage) {
        this.searchResultsPage = searchResultsPage;
    }
}
