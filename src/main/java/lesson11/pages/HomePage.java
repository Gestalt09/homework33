package lesson11.pages;

import lesson11.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {


    private By accountOption = By.xpath("//ul[@class='account-dropdown long']");
    private By searchBar = By.id("search");
    private By searchButton = By.xpath("//button[@class='button']");
    private By Cookie1 = By.xpath("//a[@class='cc-primary-btn']");
    private By SuperMan = By.id("product-58134");
    private By BuyButton = By.id("product-addtocart-button");
    private By PopUp1 = By.id("onesignal-slidedown-cancel-button");
    private By Cart = By.id("mini-cart");
    private By BillingName = By.id("billing:firstname");
    private By BillingSurname = By.id("billing:lastname");
    private By BillingEmail = By.id("billing:email");
    private By PhoneNumber = By.id("billing:telephone");
    private By Street = By.id("billing:street1");
    private By PostalCode = By.id("billing:postcode");
    private By Coupone = By.id("coupon_code");
    private By PaymentByGiftCard = By.id("giftvoucher");
    private By CourierShipping = By.id("s_method_dlw_dlw_lv");





    public void OpenLoginPage(){
        driver.findElement(accountOption).click();
    }
    public void EnterInSearch(){
        driver.findElement(searchBar).sendKeys("superman");
    }
    public void PressSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void PressBottomCookie(){driver.findElement(Cookie1).click();}
    public void SearchForProductSuperman(){ driver.findElement(SuperMan).click(); }
    public void PressBuyButton(){driver.findElement(BuyButton).click();}
    public void PressPopUp(){driver.findElement(PopUp1).click();}
    public void GoToCart(){driver.findElement(Cart).click();}
    public void FillingTheOrderBlank(String name,String surname,String username,String phonenumber,String street,String postalcode,String coupoone){
        driver.findElement(BillingName).sendKeys(name);
        driver.findElement(BillingSurname).sendKeys(surname);
        driver.findElement(BillingEmail).sendKeys(username);
        driver.findElement(PhoneNumber).sendKeys(phonenumber);
        driver.findElement(Street).sendKeys(street);
        driver.findElement(PostalCode).sendKeys(postalcode);
        driver.findElement(Coupone).sendKeys(coupoone);
    }
    public void PressPayByGiftCard(){driver.findElement(PaymentByGiftCard).click();}
    public void PressShipByCourier(){driver.findElement(CourierShipping).click();}




}
