package com.example.template;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ShortestPathTest {

    @Test
    public void test() {
        // https://assets.leetcode.com/uploads/2021/02/17/restricted_paths_ex1.png
        int[][] edges = new int[][]{{1,2,3},{1,3,3},{2,3,1},{1,4,2},{5,2,2},{3,5,1},{5,4,10}};
        int[] dist = ShortestPath.computeShortestPath(5, edges);
        int[] expected = new int[]{Integer.MAX_VALUE,4,2,1,6,0};
        assertArrayEquals(expected, dist);
    }
}
