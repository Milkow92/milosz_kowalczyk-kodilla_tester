package com.kodilla.basic_assertion.com.kodilla;


import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static com.kodilla.abstracts.basic_assertion.ResultChecker.assertEquals;

public class basic_assertion2 {
    @Test
    public void testsubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(3, subtractResult);
    }
}



