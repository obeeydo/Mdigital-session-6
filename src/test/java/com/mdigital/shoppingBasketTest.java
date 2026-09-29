package com.mdigital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class shoppingBasketTest {
    @Test
    void shouldContainCorrectShoppingCartItems(){
        shoppingBasket shoppingBasket = new shoppingBasket();

        String[] result = shoppingBasket.getCart();

        assertArrayEquals
                ( new String[]{"apples", "coke" , "milk"},
                        result
        );

    }
}