package lesson9;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OurFirstSelenium {

    @Test
    public void firstSelenium(){
        String driverPath = "C:\\Users\\Gestalt\\IdeaProjects\\lesson9\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        driver.switchTo().frame("pc_1455_24317_20201014");
        driver.findElements(By.xpath(("//img[@class='rax-image ']"))).get(1).click();
        driver.findElement(By.id("search-key")).sendKeys("tattoo");
        driver.findElement(By.xpath("//input[@class='search-button']")).click();

        driver.switchTo().frame("localstorage-proxy-ifr-alibabadotcom2");
        driver.findElements(By.xpath("//a[@class='next-dialog-close']")).get(1).click();

        driver.findElement(By.xpath("//input[@class='next-input next-small min-price']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@class='next-input next-small']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@class='ui-button narrow-go']")).click();



        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }

}