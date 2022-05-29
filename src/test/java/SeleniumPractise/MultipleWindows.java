package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver" , "C://chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        String parentWindowId = driver.getWindowHandle();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        Thread.sleep(3000);

        Set<String> set = driver.getWindowHandles();
        Iterator itr = set.iterator();

        while (itr.hasNext()){

            String childWindow = itr.next().toString();

            if(!childWindow.equals(parentWindowId)){
                driver.switchTo().window(childWindow);
                Thread.sleep(2000);


                System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
                driver.close();

            }
            driver.switchTo().window(parentWindowId);

        }

        driver.quit();


    }
}
