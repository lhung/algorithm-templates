package com.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UnionFindTest {

    @Test
    public void test() {
        UnionFind storage = new UnionFind(3);
        storage.union(0, 2);
        storage.union(1, 2);
        assertEquals(storage.find(0), storage.find(1));
    }
}
