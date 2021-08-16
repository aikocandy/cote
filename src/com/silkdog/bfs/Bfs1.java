package com.silkdog.bfs;

import java.util.Iterator;
import java.util.LinkedList;

class Bfs1 {

    public int solution(int[] numbers, int target) {
        int answer = 0;

        int v = numbers.length;
        LinkedList<Integer> adj[] = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }

        addEdge(adj, 1, 0);
        addEdge(adj, 1, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);

        BFS(adj, 3, v);

        return answer;
    }

    void addEdge(LinkedList<Integer> adj[], int v, int w) {
        adj[v].add(w);
    }

    void BFS(LinkedList<Integer> adj[], int s, int v) {
        boolean visited[] = new boolean[v];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();

                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }


    }


}
