package com.example.template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ShortestPath {

    /**
     * Dijkstra's Algorithm:
     * 1. recreate basic graph with all the edges information
     * 2. compute shortest path, starting with the end node, recursively link neighbor node
     * 3. return shortest distance from each node to node n
     */
    public static int[] computeShortestPath(int n, int[][] edges) {
        if (n == 1)
            return new int[2];

        // node -> {neighbor node, weight}
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] e : edges) {
            graph.computeIfAbsent(e[0], k -> new ArrayList<>()).add(new int[]{e[1], e[2]});
            graph.computeIfAbsent(e[1], k -> new ArrayList<>()).add(new int[]{e[0], e[2]});
        }

        // {node, distance}
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.add(new int[]{n, 0});

        // shortest path to n
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[n] = 0;

        // compute shortest path, starting from end
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int distance = cur[1];  // best distance to N
            for (int[] e : graph.get(node)) {
                int neighborNode = e[0];
                int linkWeight = e[1];
                int neighborBest = dist[neighborNode];

                if (distance + linkWeight < neighborBest) {
                    dist[neighborNode] = distance + linkWeight;
                    pq.add(new int[]{neighborNode, dist[neighborNode]});
                }
            }
        }
        return dist;
    }
}
