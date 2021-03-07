package com.example.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrieNodeTest {

    @Test
    public void test() {
        TrieNode root = new TrieNode();
        root.add("hello");
        root.add("world");
        root.add("he");
        assertEquals(2, root.count());
    }
}
