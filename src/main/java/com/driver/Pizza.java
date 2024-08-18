package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true){
            this.price = 300;
        }else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.price = this.price + 80;
        //System.out.println("Extra Cheese Added: 80");
    }

    public void addExtraToppings(){
        this.price = this.price + 70;
        //System.out.println("Extra Toppings Added: 70");
    }

    public void addTakeaway(){
        this.price = this.price + 20;
       // System.out.println("Paperbag Added: 20");
    }

    public String getBill(){
        this.bill = "Total Price: "+this.price;
        return this.bill;
    }

    protected void setPrice(int i) {
        this.price = i;
    }
}