package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpFillRelative {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Punith");
        driver.findElement(By.xpath("//input[@id='Surname']")).sendKeys("Reddy");
        driver.findElement(By.xpath("//input[@id='E_post']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys("7019886055");
        driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Puni007");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Password");


        Thread.sleep(5000);

        driver.quit();


    }


}
