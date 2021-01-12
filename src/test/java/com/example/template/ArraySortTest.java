package com.example.template;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class ArraySortTest {

    @Test
    public void test() {
        int[] data = new int[]{1,2,3,4,5};
        ArraySort.sort(data);
        assertArrayEquals(new int[]{5,1,4,2,3}, data);
    }
}