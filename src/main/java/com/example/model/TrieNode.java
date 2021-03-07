package com.example.model;

public class TrieNode {
    private final TrieNode[] data;

    public TrieNode() {
        this.data = new TrieNode[26];
    }

    public void add(String s) {
        this.add(s.toCharArray(), 0);
    }

    private void add(char[] s, int index) {
        if (index == s.length)
            return;

        int c = s[index] - 'a';
        if (data[c] == null)
            data[c] = new TrieNode();
        data[c].add(s, index + 1);
    }

    public int count() {
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (data[i] != null)
                res += data[i].count();
        }
        return res == 0 ? 1 : res;
    }
}
