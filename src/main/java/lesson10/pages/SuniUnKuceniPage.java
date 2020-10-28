package lesson10.pages;

import lesson10.Common;
import org.openqa.selenium.By;

public class SuniUnKuceniPage extends Common {

    private By Vecums = By.xpath("f_o_1276_min");

    public void Age (){
        driver.findElement(Vecums).sendKeys("1");
    }

}
