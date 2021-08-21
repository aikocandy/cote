package com.silkdog.baekjoon.queuewrap.queue11866;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list_excluded = new LinkedList<>();

        int size = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken()) - 1;
        int step = idx;

        for (int i = 1; i <= size; i++) {
            list.add(i);
        }

        for (int i = 1; i <= size; i++) {
            if(idx > list.size()) idx = list.size() - idx + step;
            list_excluded.addLast(list.get(idx));
            list.remove(idx);
            idx += step;
        }

        for (int i = 1; i < size; i++) {
            System.out.println(list_excluded.get(i - 1));
        }


    }
}
