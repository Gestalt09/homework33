package lesson10;
import lesson10.pages.HomePage;
import lesson10.pages.SuniUnKuceniPage;


public class MyFirstTest {


public  static void main(String[] args) {
    HomePage page = new HomePage();
    SuniUnKuceniPage page2 = new SuniUnKuceniPage();
    page.startPage ("https://www.ss.lv/");
    page.chooseAnimalType();
    page2.Age();




}
}
