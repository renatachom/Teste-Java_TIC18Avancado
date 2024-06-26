package com.example.atividades.atividade04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestSortNumbers {
    private final SortNumbers sortNumbers = new SortNumbers();

    @Test
    public void testSortNormalList() {
        List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 2);
        List<Integer> sortedNumbers = sortNumbers.sortNumbers(numbers);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), sortedNumbers);
    }

    @Test
    public void testSortSingleElementList() {
        List<Integer> numbers = Collections.singletonList(42);
        List<Integer> sortedNumbers = sortNumbers.sortNumbers(numbers);
        assertEquals(Collections.singletonList(42), sortedNumbers);
    }

    @Test
    public void testSortEmptyList() {
        List<Integer> numbers = Collections.emptyList();
        List<Integer> sortedNumbers = sortNumbers.sortNumbers(numbers);
        assertEquals(Collections.emptyList(), sortedNumbers);
    }

    @Test
    public void testSortNullList() {
        assertThrows(NullPointerException.class, () -> {
            sortNumbers.sortNumbers(null);
        });
    }

    @Test
    public void testSortListWithNegativeNumbers() {
        List<Integer> numbers = Arrays.asList(-1, -3, -2, -5, -4);
        List<Integer> sortedNumbers = sortNumbers.sortNumbers(numbers);
        assertEquals(Arrays.asList(-5, -4, -3, -2, -1), sortedNumbers);
    }

    @Test
    public void testSortListWithMixedNumbers() {
        List<Integer> numbers = Arrays.asList(-10, 0, 10, 5, -5);
        List<Integer> sortedNumbers = sortNumbers.sortNumbers(numbers);
        assertEquals(Arrays.asList(-10, -5, 0, 5, 10), sortedNumbers);
    }
}
