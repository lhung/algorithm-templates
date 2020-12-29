package com.example.model;

import java.util.Arrays;

public class UnionFind {

    private int[] parent;

    public UnionFind(int n) {
        parent = new int[n];
        Arrays.setAll(parent, i -> i);
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        parent[find(x)] = parent[find(y)];
    }
}
