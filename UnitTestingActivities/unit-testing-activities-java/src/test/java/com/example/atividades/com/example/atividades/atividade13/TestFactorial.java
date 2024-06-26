package com.example.atividades.atividade13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestFactorial {

    @Test
    public void testCalculateFactorialZero() {
        Factorial factorial = new Factorial();
        int result = factorial.calculate(0);
        assertEquals(1, result);
    }

    @Test
    public void testCalculateFactorialPositive() {
        Factorial factorial = new Factorial();
        int result = factorial.calculate(5);
        assertEquals(120, result);
    }

    @Test
    public void testCalculateFactorialNegative() {
        Factorial factorial = new Factorial();
        assertThrows(IllegalArgumentException.class, () -> factorial.calculate(-1));
    }
}
