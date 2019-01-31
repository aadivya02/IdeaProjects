package com.company;

interface Toppings {
    String info();
}

class Pizza implements Toppings {

    private String Size;

    public Pizza(String Size) {
        this.Size = Size;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    @Override
    public String info() {
        return "A Pizza of Size : " + Size;
    }
}
class CapsicumToppings implements Toppings {
    private Toppings Toppings;
    private String extracheese;
    private String Topping;

    public String getExtracheese() {
        return extracheese;
    }

    public void setExtracheese(String extracheese) {
        this.extracheese = extracheese;
    }

    public CapsicumToppings(Toppings Toppings, String extracheese, String Topping) {
        this.Toppings = Toppings;
        this.extracheese = extracheese;
        this.Topping= Topping;
    }

    public Toppings getToppings() {
        return Toppings;
    }

    public void setToppings(Toppings toppings) {
        Toppings = toppings;
    }

    public String isExtracheese() {
        return extracheese;
    }




    public String getTopping() {
        return Topping;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }

    @Override
    public String info() {
        return Toppings.info() + " with extracheese  " + "With" + Topping +" Topping" ;
    }
}

class OnionToppings implements Toppings {
    private Toppings Toppings;
    private String extracheese;
    private String Topping;



    public OnionToppings(Toppings Toppings, String extracheese, String Topping) {
        this.Toppings = Toppings;
        this.extracheese = extracheese;
        this.Topping= Topping;
    }

    public Toppings getToppings() {
        return Toppings;
    }

    public void setToppings(Toppings toppings) {
        Toppings = toppings;
    }

    public String isExtracheese() {
        return extracheese;
    }



    public String getTopping() {
        return Topping;
    }

    public void setTopping(String topping) {
        Topping = topping;
    }

    @Override
    public String info() {
        return Toppings.info() + " with extracheese " +extracheese  + "With"
            +Topping +" Topping" ;

    }
}

public class Example6 {

    public static void main(String[] args) {
        Pizza pizza= new Pizza("Medium");
        System.out.println(pizza.info());
        CapsicumToppings capsicumToppings=new CapsicumToppings(new Pizza("Small"),"yes","Capsicum");
        System.out.println(capsicumToppings.info());
        OnionToppings onionToppings=new OnionToppings(new Pizza("Large"),"No","Onion");
        System.out.println(onionToppings.info());

    }
}
