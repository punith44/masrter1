package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoFormFillAbsolute {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/input")).sendKeys("Punith R");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/input")).sendKeys("7019886046");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/input")).sendKeys("punith@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[4]/input")).sendKeys("12345@punith");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[5]/textarea")).sendKeys("No 46,1st Main Road Vijaya Bank Layout,Bangalore-76");

        Thread.sleep(5000);


        driver.quit();
    }
}
