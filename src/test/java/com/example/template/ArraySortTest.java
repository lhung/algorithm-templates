package com.example.template;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ArraySortTest {

    @Test
    public void test() {
        int[] data = new int[]{1,2,3,4,5};
        ArraySort.sort(data);
        System.out.println(Arrays.toString(data));
    }
}