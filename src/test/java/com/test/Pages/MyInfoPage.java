package com.test.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.test.BaseClass.TestBase.webdriver;

public class MyInfoPage {


    public MyInfoPage() {

        PageFactory.initElements(webdriver, this);
    }



    @FindBy(xpath = "//input[@value='Marketplace']")
    public  WebElement Marketplace;


    @FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
    public  WebElement MyInfoLink;

    @FindBy(xpath = "//input[@id='btnSave']")
    public  WebElement personalEditButton;




}
