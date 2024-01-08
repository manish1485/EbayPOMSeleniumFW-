package com.abc.tests;

import org.testng.annotations.*;

public class test extends DataProviderTest {

/*    @BeforeClass
    public void beforeClassSetup(){
        System.out.println("Before Class Setup Executed");
    }

    @AfterClass
    public void afterClassTearDown(){
        System.out.println("After Class Tear Down Executed");
    }

//Code added by another team member today dated 7th Jan
//feature branch  created to add new code
//added code
//Manish branch code added
//abcde
//abc


    @BeforeMethod
    public void BeforeMethodSetup(){
        System.out.println("Before Method Setup Executed");
    }
    @AfterMethod
    public void AfterMethodTearDown(){
        System.out.println("After Method Tear Down Executed");
    }*/

    @Test()
    public void beforeTest1(){
        System.out.println("Test 1 Executed");
    }

    @Test
    public void afterTest2(){
        System.out.println("Test 2 Executed");
    }

    @Test(dataProvider = "allData" , dataProviderClass = DataProviderTest.class)
    public void Test3(String p1, String p2){
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Test 3 Executed");

    }
}
