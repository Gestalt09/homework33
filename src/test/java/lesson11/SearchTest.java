package lesson11;

import lesson11.pages.HomePage;
import org.junit.Test;

public class SearchTest {

    @Test
    public void positiveOrder(){
        Common common = new Common();
        HomePage homePage =new HomePage();




        common.startPage("https://www.janisroze.lv/");

        homePage.enterInSearch();
        homePage.pressSearchButton();




        homePage.enterSuperman();



    }
}
