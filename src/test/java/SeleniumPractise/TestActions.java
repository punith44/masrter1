package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class TestActions {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //azurewebsites(driver, "https://itera-qa.azurewebsites.net/home/automation");
        //HoverMoveonAWebElement(driver ,"https://freecrm.com");
        testGooglePage(driver, "https://google.com");




    }

    public static void azurewebsites(WebDriver driver, String url) throws InterruptedException {

        driver.get(url);

        Actions actions = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
        actions.moveToElement(element)
                .click()
                .sendKeys("Punith R")
                .sendKeys(Keys.TAB)
                .sendKeys("9972504444")
                .sendKeys(Keys.TAB)
                .build()
                .perform();

        Thread.sleep(2000);

        driver.quit();
    }

    public static void HoverMoveonAWebElement(WebDriver driver, String url){

        driver.get(url);

        WebElement element = driver.findElement(By.xpath("//a[text()='Free CRM']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(element)
                .build()
                .perform();

        driver.quit();

    }
    public static void testGooglePage(WebDriver driver, String url) throws InterruptedException {
        driver.get(url);

        WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
        Actions actions = new Actions(driver);

        actions.sendKeys("facebook.com")
                .build()
                .perform();
        Thread.sleep(4000);
        driver.quit();
    }

    public static void testGooglePage(WebDriver driver, String url) throws InterruptedException {
        driver.get(url);

        WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
        Actions actions = new Actions(driver);

        actions.sendKeys("facebook.com")
                .build()
                .perform();
        Thread.sleep(4000);
        driver.quit();


}