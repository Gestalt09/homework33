package lesson11.pages;

import lesson11.Common;
import org.openqa.selenium.By;

public class LoginPage extends Common {

    private By usernameElement = By.id("email");
    private By passwordElement = By.id ("pass");
    private By Submit = By.id("send2");
    private By Facebook = By.xpath("//div[@class='scandi-facebookconnect-facebook-inner']");
    private By AcceptButton = By.id("u_0_g");

    public void loginToProfile(String username,String  password){
        driver.findElement(usernameElement).sendKeys(username);
        driver.findElement(passwordElement).sendKeys(password);
    }
    public void pressSubmit(){
        driver.findElement(Submit).click();
    }
    public void pressFacebookLogin(){
        driver.findElement(Facebook).click();
    }
    public void pressAcceptButton(){
        driver.findElement(AcceptButton).click();
    }
}
