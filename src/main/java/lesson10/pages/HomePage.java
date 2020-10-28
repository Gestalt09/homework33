package lesson10.pages;

import lesson10.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {

    private By suniUnKuceni1 = By.xpath("mtd_300");
    private By vieglieAuto = By.xpath("mtd_97");


    public void chooseAnimalType() {
        driver.findElement(suniUnKuceni1).click();
    }
    public void chooseCarType(){
        driver.findElement(vieglieAuto).click();
    }

}