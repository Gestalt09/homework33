package lesson11;

import lesson11.models.UserModel;
import lesson11.pages.HomePage;
import lesson11.pages.LoginPage;
import org.junit.Test;

public class LoginTest {

    @Test
    public  void positiveLoginTest(){
        Common common = new Common();
        HomePage homePage =new HomePage();
        LoginPage loginPage = new LoginPage();
        UserModel userModel = new UserModel();


        common.startPage("https://www.janisroze.lv/");

        homePage.openLoginPage();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        loginPage.loginToProfile(userModel.getUsername(), userModel.getPassword());
        loginPage.pressSubmit();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        common.stopDriver();

    }
}
