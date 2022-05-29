package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" ,"C://chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='alertButton']")).click();

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(2000);
        String str = driver.switchTo().alert().getText();
        System.out.println("The alert is :"+str);
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Sample Alert Message");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='promtButton']")).click();

        if(isAlertPresent(driver)){
            System.out.println("Alert is Present in the Web Page");

        }else{

            System.out.println("Alert is Not Present in the Web Page");
        }
        driver.quit();

    }

    public static boolean isAlertPresent(WebDriver driver){

        try{
            driver.switchTo().alert().accept();
            return true;

        } catch (NoAlertPresentException ex){
            return false;
        }
    }
}
