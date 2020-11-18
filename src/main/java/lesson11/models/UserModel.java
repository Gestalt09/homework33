package lesson11.models;

public class UserModel {
    private String username = "dragon123@gmail.com";
    private String password= "qwerty123";
    private String BillingName = "Chet";
    private String BillingSurname = "Baker";
    private String PhoneNumber = "88005553535";
    private String Address = "Pushkina Street 19";
    private String PostalCode = "LV-10384";
    private String Coupon = "777";


    public String getPassword(){ return  password; }
    public String getUsername(){ return  username; }
    public String getBillingName(){return BillingName;}
    public String getBillingSurname(){return BillingSurname;}
    public String getPhoneNumber(){return PhoneNumber;}
    public String getAddress(){return Address;}
    public String getPostalCode(){return PostalCode;}
    public String getCoupon(){return Coupon;}



}
