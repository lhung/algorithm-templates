package com.example.template;

import com.example.model.TreeNode;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class BitManipulation {

    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i); // expand mask in each loop from the most significant bit
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num & mask);
            }
            int tmp = max | (1 << i);
            for (int prefix : set) {
                if (set.contains(tmp ^ prefix)) {   // if a ^ b = c, then a ^ c = b
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }

    private int dfs(TreeNode root, int count) {
        if (root == null) return 0;
        // using an integer to track odd/even counts of 1-9 digits
        count ^= 1 << (root.val - 1);
        int res = dfs(root.left, count) + dfs(root.right, count);
        // if only 1 bit set, & with 1 will be 0
        boolean onlyOneBitSet = (count & (count - 1)) == 0;
        if (root.left == root.right && onlyOneBitSet) res++;
        return res;
    }

    // variation that use BitSet instead of integer
    private int dfs(TreeNode root, BitSet count) {
        if (root == null) return 0;
        count.flip(root.val);
        int res = dfs(root.left, count) + dfs(root.right, count);
        boolean atMostOneBitSet = count.cardinality() <= 1;
        if (root.left == root.right && atMostOneBitSet) res++;
        return res;
    }
}
