package com.mdigital;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class romanNumerialsTest {
    romanNumerials rm = new romanNumerials();

@Test
    void getLetterIsResult(){
    assertEquals("I" , rm.toRoman(1));
    }

    @Test
    void getToStringsAdded(){
    String result = "X" + "I";
    assertEquals(result, rm.toRoman(11));
    }

    @Test
    void getResult(){
    assertEquals("CXX", rm.toRoman(120));
    }

}


