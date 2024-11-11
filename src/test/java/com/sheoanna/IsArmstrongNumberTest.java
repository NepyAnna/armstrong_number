package com.sheoanna;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IsArmstrongNumberTest {
    ArmstrongNumber number;
    List<Integer> symbols;
    int sumOfPows;

    @BeforeEach
    void setUp(){ 
        number = new ArmstrongNumber(371);
        symbols = number.getsymbolsFromNumber(number.getNumber());
        sumOfPows = number.getSumOfNemberPows(symbols);
    }

    @Test
    void getsymbolsFromNumberTest() {
        assertEquals(3, symbols.size());
    }

    @Test
    void getSumOfNemberPowsTest() {
        assertEquals(371, sumOfPows);
    }

    @Test
    void checkIsArmstrongNumberTest() {
        assertTrue(number.checkIsArmstrongNumber());
    }

}
