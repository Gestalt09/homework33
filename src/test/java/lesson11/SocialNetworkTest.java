package lesson11;

import lesson11.models.UserModel;
import lesson11.pages.FacebookPage;
import lesson11.pages.HomePage;
import lesson11.pages.LoginPage;
import org.junit.Test;

public class SocialNetworkTest {

    @Test
    public void positiveLoginTest() {
        Common common = new Common();
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        FacebookPage facebookPage =new FacebookPage();
        UserModel userModel = new UserModel();

        common.startPage("https://www.janisroze.lv/");

        homePage.openLoginPage();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        loginPage.pressFacebookLogin();
        loginPage.pressAcceptButton();
        facebookPage.pressFacebookAccept();
        facebookPage.loginToFacebook(userModel.getUsername(), userModel.getPassword());
        facebookPage.pressLogin();


    }
}