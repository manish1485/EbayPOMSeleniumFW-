package com.abc.tests;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("your name is " + s);

        System.out.println("Enter your age");
        int age=sc.nextInt();

        System.out.println("your age is " + age);

    }
}
