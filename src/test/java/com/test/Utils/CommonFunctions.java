package com.test.Utils;

import com.test.Pages.LoginPage;

import java.io.File;

public class CommonFunctions {

    private static final String OrangeHRMURL = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
    private static final String UserName = "Admin";
    private static final String Password = "admin123";
    private static final String EmpDataFilePath = (System.getProperty("user.dir")+ File.separator + "src/test/resources/CustomerData.xlsx");

    public static String getOrangeHRMURL(){
    return OrangeHRMURL;
    }

    public static String getUserName(){
        return UserName;
    }

    public static String getPassword(){
        return Password;
    }

    public static String getEmployeeDataFilePath(){
        return EmpDataFilePath;
    }
}
