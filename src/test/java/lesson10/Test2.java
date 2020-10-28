package lesson10;

import lesson10.pages.HomePage;
import lesson10.pages.vieglieAutoPage;


public class Test2 {


    public static void main(String[] args) {
        HomePage page = new HomePage();
        vieglieAutoPage page2 = new vieglieAutoPage();
        page.startPage("https://www.ss.lv/");
        page.chooseCarType();
        page2.enterCarStartPrice();
        page2.enterCarMaxPrice();
        page2.enterCarMinYear();
        page2.enterCarMaxEngine();
        page2.enterColor();
        page2.pressSubmitButton();


    }
}