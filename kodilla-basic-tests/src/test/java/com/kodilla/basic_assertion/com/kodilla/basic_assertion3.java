package com.kodilla.basic_assertion.com.kodilla;


import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static com.kodilla.abstracts.basic_assertion.ResultChecker.assertEquals;

public class basic_assertion3 {
    @Test
    public void testinvolution() {
        Calculator calculator = new Calculator();
        int a = 5;
        int involutionResult = calculator.involution(a);
        assertEquals(25, involutionResult);
    }
}

