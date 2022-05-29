package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tabls {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();

        Thread.sleep(5000);

        //table
        // thead --> tr --> th
        //tbody --> tr ---> td

//table[@id='resultTable']/thead/tr/th[5]/a

        List<WebElement> ColsCount = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));

        int index = 2;

        for (int i = 1; i < ColsCount.size(); i++) {
            String str = driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th[" + index + "]/a")).getText();
            index++;
            System.out.print(str + "           ");
        }

        System.out.println();
        List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));


        for (int i = 1; i <= rowCount.size(); i++) {
            String str = "";
            for (int j = 2; j <= ColsCount.size(); j++) {

                if (j == 2) {

                    str = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[" + j + "]/a")).getText();
                } else {
                    str = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                }

                System.out.print(str + "           ");
            }

            System.out.println();
        }

        Thread.sleep(5000);
        driver.quit();

    }
}