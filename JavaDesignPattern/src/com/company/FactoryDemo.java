package com.company;

interface HotDrink{

    void prepareHotDrink();
}

class Tea implements HotDrink{

    @Override
    public void prepareHotDrink() {
        System.out.println("This restaurant will serve Tea");
    }
}

class Coffee implements HotDrink{

    @Override
    public void prepareHotDrink() {
        System.out.println("This restaurant will serve coffee");
    }
}

class Restaurant{

    HotDrink hotDrink;


    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}

class RestaurantFactory{

    static Restaurant getRestaurantObject(String name){
        Restaurant restaurant= new Restaurant();
        switch (name){
            case "restaurantWithTea":
                restaurant.setHotDrink(new Tea());
                break;
            case "restaurantWithCoffee" :
                restaurant.setHotDrink(new Coffee());
                break;
        }
        return restaurant;
    }
}
public class FactoryDemo{

    public static void main(String[] args) {

        Restaurant restaurantWithTea = RestaurantFactory.getRestaurantObject("restaurantWithTea");
        restaurantWithTea.getHotDrink().prepareHotDrink();
        Restaurant restaurantWithCoffee = RestaurantFactory.getRestaurantObject("restaurantWithCoffee");
        restaurantWithCoffee.getHotDrink().prepareHotDrink();

    }
}


