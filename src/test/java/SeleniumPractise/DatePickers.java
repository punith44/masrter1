package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickers {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");

        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();

        String month = "August 2020";
        String date = "15";

        while(true){

            String calMonth = driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']/div[1]/div[1]")).getText();

            if(calMonth.equals(month)){

                break;
            }else{

                driver.findElement(By.xpath("//div[@class='react-datepicker__triangle']/following-sibling::button[1]")).click();
                Thread.sleep(1000);
            }

        }


        driver.findElement(By.xpath("//div[@role='listbox']/div/div[contains(text(),'"+date+"')]")).click();

        Thread.sleep(6000);
        driver.quit();
        driver.quit();
    }
}


