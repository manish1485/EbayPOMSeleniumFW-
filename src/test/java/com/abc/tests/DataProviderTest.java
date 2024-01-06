package com.abc.tests;

import com.abc.lib.ReadExcelLib;
import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider
    public Object [][] allData(){

        ReadExcelLib excelLib=new ReadExcelLib();
        String file="C:/Users/mailm/TestNGFramework/TestData/testdata.xlsx";
        return excelLib.Get_Excel_Data(file,"Sheet1", 2);
    }
}
