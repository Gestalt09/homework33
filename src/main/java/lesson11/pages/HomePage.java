package lesson11.pages;

import lesson11.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {


    private By accountOption = By.xpath("//ul[@class='account-dropdown long']");
    private By searchBar = By.id("search");
    private By searchButton = By.xpath("//button[@class='button']");
    private By SuperMan = By.xpath("//button[@class='button btn-cart']");




    public void openLoginPage(){
        driver.findElement(accountOption).click();
    }
    public void enterInSearch(){
        driver.findElement(searchBar).sendKeys("superman");
    }
    public void pressSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void enterSuperman(){ driver.findElement(SuperMan).click();}




}
