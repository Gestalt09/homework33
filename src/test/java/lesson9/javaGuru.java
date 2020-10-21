package lesson9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class javaGuru {
    @Test
    public  void  javaGuru(){
        String driverPath = "C:\\Users\\Gestalt\\IdeaProjects\\lesson9\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://javaguru.lv/moodle/login/index.php");
        driver.findElement(By.id("username")).sendKeys("gestal09");
        driver.findElement(By.id("password")).sendKeys("svidrik10zx");
        driver.findElement(By.xpath("//input[@value='Вход']")).click();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();



    }
}
