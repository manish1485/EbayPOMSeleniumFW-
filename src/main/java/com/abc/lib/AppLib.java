package com.abc.lib;

import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class AppLib {
    private ChromeDriver driver;
    private PageLib page;
    private FlowLib flow;

    public AppLib(ChromeDriver driver){
        this.driver=driver;
        page=new PageLib(this.driver);
        flow=new FlowLib(this.driver);
    }

    public PageLib getPage() {
        return page;
    }

    public FlowLib getFlow() {
        return flow;
    }
}
