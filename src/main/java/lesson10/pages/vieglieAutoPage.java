package lesson10.pages;
import lesson10.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class vieglieAutoPage extends Common {
    private By CarStartPrice = By.xpath("f_o_8_min");
    private By CarMaxPrice = By.xpath("f_o_8_max");
    private By minCarYear = By.xpath("f_o_18_min");
    private By engineMax = By.xpath("f_o_15_max");
    private By CarColor = By.xpath("f_o_17");
    private By submitButton = By.xpath("//input[@class='b s12']");

    public void enterCarStartPrice(){
        driver.findElement(CarStartPrice).sendKeys("6000");
    }
    public void enterCarMaxPrice(){
        driver.findElement(CarMaxPrice).sendKeys("10000");
    }
    public void enterCarMinYear(){
        Select minYear = new Select((WebElement) minCarYear);
        minYear.selectByValue("2001");
    }
    public void enterCarMaxEngine(){
        Select maxEngine = new Select((WebElement) engineMax);
        maxEngine.selectByValue("3.0");
    }
    public void enterColor(){
        Select color = new Select((WebElement)CarColor);
        color.selectByValue("6318");

    }
    public void pressSubmitButton(){
        driver.findElement(submitButton).click();
    }


}
