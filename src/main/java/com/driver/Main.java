package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza dp = new Pizza(true);
    System.out.println("Base Price Of The Pizza: "+dp.getPrice());
//    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    DeluxePizza p = new DeluxePizza(true);
    System.out.println("Base Price Of The Pizza: "+p.getPrice());
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}