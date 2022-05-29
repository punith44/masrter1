package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFormFillRelativeX {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Punith R");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7019886026");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("punith@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567@abc");
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("VijayaBank Layout,Bangalore");

        Thread.sleep(5000);

        driver.quit();

    }
}
