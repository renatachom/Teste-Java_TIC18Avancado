package com.example.atividades.atividade01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {
    private final Add add = new Add();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, add.add(2, 3));
    }

    @Test
    public void testAddNegativeAndPositive() {
        assertEquals(0, add.add(-1, 1));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-2, add.add(-1, -1));
    }
}
