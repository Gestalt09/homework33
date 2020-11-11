package lesson11.pages;

import lesson11.Common;
import org.openqa.selenium.By;

public class FacebookPage extends Common {

    private By acceptAllButton = By.id("u_0_j");
    private By emailElement = By.id("email");
    private By passwordElement = By.id("pass");
    private By loginButton = By.id("loginbutton");


    public void pressFacebookAccept(){
        driver.findElement(acceptAllButton).click();
    }
    public void loginToFacebook (String username,String password){
        driver.findElement(emailElement).sendKeys(username);
        driver.findElement(passwordElement).sendKeys(password);
    }
    public void pressLogin(){
        driver.findElement(loginButton).click();
    }
}
