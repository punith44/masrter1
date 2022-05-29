package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id = 'female']")).click();

        WebElement element =  driver.findElement(By.xpath("//input[@id = 'female']"));

        if (element.isSelected()){

            System.out.println("The Radio button is Selected ");

        } else{

            System.out.println("The Radio button is Not Selected");
        }

        if(driver.findElement(By.xpath("//input[@id = 'other']")).isEnabled()){

            System.out.println("The button is available to Click");

        }else{

            System.out.println("The button is not available to Click");


        }

        if(driver.findElement(By.xpath("//input[@id = 'male']")).isDisplayed()){

            System.out.println("The button is Displayed");

        }else{
            System.out.println("The button is Not available to Click");

        }

        List<String> list =new ArrayList<String>();

        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursday");
        list.add("friday");
        list.add("saturday");
        list.add("sunday");

        String RadioButton = "//input[@id='%s']";

        for(int i=0;i< list.size();i++){

            WebElement CheckBox = deriveXpath(RadioButton,driver,list.get(i));
            CheckBox.click();

        }









        Thread.sleep(2000);

        driver.quit();



    }

    private static WebElement deriveXpath(String dynxpath, WebDriver driver, String s) {



                return driver.findElement(By.xpath(String.format(dynxpath,s)));

    }
}
