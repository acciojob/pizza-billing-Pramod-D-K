package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza dp = new Pizza(true);
    dp.getPrice();
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    DeluxePizza p = new DeluxePizza(false);
    System.out.println("Base Price Of The Pizza: "+p.getPrice());
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());
  }
}