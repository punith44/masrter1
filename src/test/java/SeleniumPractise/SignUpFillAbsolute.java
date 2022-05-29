package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpFillAbsolute {

    public static void main(String[] args) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver" , "C:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/UserRegister/NewUser");

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div/form/div/div[1]/div/input")).sendKeys("Punith");
        driver.findElement(By.xpath("/html/body/div/form/div/div[2]/div/input")).sendKeys("Reddy");
        driver.findElement(By.xpath("/html/body/div/form/div/div[3]/div/input")).sendKeys("Bangalore");
        driver.findElement(By.xpath("/html/body/div/form/div/div[4]/div/input")).sendKeys("7019886055");
        driver.findElement(By.xpath("/html/body/div/form/div/div[5]/div/input")).sendKeys("Punith007");
        driver.findElement(By.xpath("/html/body/div/form/div/div[6]/div/input")).sendKeys("Password");
        driver.findElement(By.xpath("/html/body/div/form/div/div[7]/div/input")).sendKeys("Password");

        Thread.sleep(5000);


        driver.quit();


    }
}
