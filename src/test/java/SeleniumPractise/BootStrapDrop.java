package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootStrapDrop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.get("https://freecrm.com/");

        List<WebElement> list = driver.findElements(By.xpath("//a"));

        for(int i=0; i< list.size();i++){
            System.out.println(list.get(i).getText());

        }
        System.out.println("The total no of links in Web Page are: " + list.size());



        /////////********BootStrap DropDown**************/////////

        driver.findElement(By.xpath("//span[@class='rd-navbar-submenu-toggle']")).click();

        List<WebElement> elementslist = driver.findElements(By.xpath("//ul[@class='rd-navbar-dropdown rd-navbar-submenu-toggle']/li/a"));

        for (int i=0;i<elementslist.size();i++){

            System.out.println(elementslist.get(i).getText());

            if(elementslist.get(i).getText().equals("Automotive CRM")){

                elementslist.get(i).click();
                break;

            }
        }




        Thread.sleep(5000);

        driver.quit();

    }
}
