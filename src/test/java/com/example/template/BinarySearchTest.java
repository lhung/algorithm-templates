package com.example.template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testStrictlyLessThan() {
        assertEquals(0, BinarySearch.countStrictlyLessThan(new int[]{1,1,3,5,7}, 0));
        assertEquals(0, BinarySearch.countStrictlyLessThan(new int[]{1,1,3,5,7}, 1));
        assertEquals(2, BinarySearch.countStrictlyLessThan(new int[]{1,1,3,5,7}, 3));
        assertEquals(5, BinarySearch.countStrictlyLessThan(new int[]{1,1,3,5,7}, 8));
    }
}
