package com.mdigital;

public class shoppingBasket {
    public String[] cart;

    public shoppingBasket(){
        this.cart = new String[3];
        this.cart[0] = "apples";
        this.cart[1] = "coke";
        this.cart[2] = "milk";
    }
    public String[] getCart(){
        return this.cart;
    }
}
