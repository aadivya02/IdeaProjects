package com.company;

class Customer
{
    int tokenNo;
    int foodPrice;
    String foodName;
    public Customer(int fp, String fn)
    {
        foodPrice = fp;
        foodName = fn;
        System.out.println("order cost::" + foodPrice);
        System.out.println("order type::" + foodName);
    }
    public void getToken(int tokenno)
    {
        this.tokenNo = tokenNo;
    }

    public void isOrderReady(){

    }

    public collectCoffw()

}
class Cashier
{
    int Orderid;
    public Cashier (int Orderid)
    {
        this.Orderid=Orderid;
        System.out.println("order id ::"+Orderid);
    }
    public void getToken()
    {
        System.out.println("order placed");
    }

    public int placeOrder(String cust, int cash){
        int token = getToken();
        return token;
    }

}
class Barista
{
    public void prepare_coffee(){
        System.out.println("coffee is prepared"); }
 public void notification() {
 System.out.println("order is placed");
}
}
public class Example10
{
    public static void main(String[] args)
    {
        Barista b = new Barista();
        Customer c=new Customer(200,"cappuccino");
        Cashier c1=new Cashier(10);
        b.prepare_coffee();
        c1.givesToken();
b.notification();
    }
}





