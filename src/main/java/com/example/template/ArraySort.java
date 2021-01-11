package com.example.template;

import java.util.Arrays;

public class ArraySort {

    /**
     * original array is unsorted, would like to sort in order and make
     * [1,2,3,4,5] to [5,1,4,2,3]
     */
    public static void sort(int[] input) {
        if (input == null || input.length == 1)
            return;

        Arrays.sort(input);
        int n = input.length;
        for (int i = 0; i < n; i++) {
            reverse(input, i);
        }
    }

    // reverse input from startIndex to end
    private static void reverse(int[] input, int startIndex) {
        if (input == null || input.length == 0)
            return;

        int left = startIndex;
        int right = input.length - 1;
        while (left < right) {
            swap(input, left++, right--);
        }
    }

    private static void swap(int[] input, int x, int y) {
        int temp = input[x];
        input[x] = input[y];
        input[y] = temp;
    }
}
