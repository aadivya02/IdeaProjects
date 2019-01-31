package com.company;

import  java.lang.String;
interface Pizza {
    String  info();
}
class LargePizza implements Pizza {
    String name;

    public LargePizza(String name) {
        this.name = name;
    }

    public String info() {
        return  " It is a large pizza "  +  name ;
    }

}
class SmallPizza implements Pizza{
    String name;
    public SmallPizza(String name) {
        this .name= name;
    }
    public String info(){
        return  " It is a small pizza "  +   name ;
    }
}
class Toppings implements   Pizza {
    Pizza pizza;
    String decoration;
    public Toppings(Pizza pizza,String decoration) {
        this.pizza=pizza;
        this.decoration=decoration;
    }

    @Override
    public String  info() {
        return pizza.info() + " with topping "  +  decoration;
    }


}

public class Example6 {
    public static void main(String[] args) {
        LargePizza l=new LargePizza("GARLIC");
        System.out.println(l.info());
        Toppings t=new Toppings(new LargePizza("TOMATO"),"paneer");
        System.out.println(t.info());

        SmallPizza s=new SmallPizza("ONION");
        System.out.println(s.info());
        Toppings t1=new Toppings(new SmallPizza("CAPSICUM"),"cheese");
        System.out.println(t1.info());
    }
}
