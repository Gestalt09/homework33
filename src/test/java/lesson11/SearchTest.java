package lesson11;

import lesson11.models.UserModel;
import lesson11.pages.HomePage;
import org.junit.Test;

public class SearchTest {

    @Test
    public void positiveOrder(){
        Common common = new Common();
        HomePage homePage =new HomePage();
        UserModel UserModel = new UserModel();




        common.startPage("https://www.janisroze.lv/");

        homePage.EnterInSearch();
        homePage.PressSearchButton();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage.PressBottomCookie();

        homePage.SearchForProductSuperman();
        homePage.PressBuyButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage.PressPopUp();
        homePage.GoToCart();
        homePage.FillingTheOrderBlank(UserModel.getBillingName(),UserModel.getBillingSurname(), UserModel.getUsername(),UserModel.getPhoneNumber(),UserModel.getAddress(),UserModel.getPostalCode(),UserModel.getCoupon());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage.PressPayByGiftCard();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage.PressShipByCourier();




    }
}
