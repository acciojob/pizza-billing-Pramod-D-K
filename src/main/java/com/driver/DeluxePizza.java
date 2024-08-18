package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
    }

    public void addExtraToppings(){
        super.setPrice(this.getPrice()+ 120);
        System.out.println("Extra Toppings Added: 120");
    }
}