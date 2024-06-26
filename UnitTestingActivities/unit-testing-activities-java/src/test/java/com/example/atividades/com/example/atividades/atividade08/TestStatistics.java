package com.example.atividades.atividade08;

import static org.junit.jupiter.api.Assertions.*;
import com.example.atividades.atividade08.Statistics;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TestStatistics {

    @Test
    public void testCalculateAverage() {
        Statistics statistics = new Statistics();
        
        // Test with a valid number list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double average = statistics.calculateAverage(numbers);
        assertEquals(3.0, average);
    }

    @Test
    public void testCalculateAverageWithEmptyList() {
        // Test with an empty list of numbers
        List<Integer> numbers = Arrays.asList();
        Statistics statistics = new Statistics(); // Instanciando Statistics
        assertThrows(IllegalArgumentException.class, () -> {
            statistics.calculateAverage(numbers); // Corrigindo a chamada para statistics.calculateAverage()
        }, "Calculating average of an empty list should throw IllegalArgumentException");
    }

    @Test
    public void testCalculateAverageNullList() {
        Statistics statistics = new Statistics();
        
        // Test with a null number list
        List<Integer> numbers = null;
        assertThrows(IllegalArgumentException.class, () -> {
            statistics.calculateAverage(numbers);
        });
    }
}

