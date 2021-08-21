package com.silkdog.baekjoon.queuewrap.queue2164;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        int val;

        for(int i = 1; i<= size; i++){
            deque.addLast(i);
        }

        while(deque.size() > 1){
            deque.pollFirst();
            if(deque.size() == 1) break;
            else{
                val = deque.pollFirst();
                deque.addLast(val);
            }

        }

        bw.write(String.valueOf(deque.getFirst()));
        bw.flush();
        bw.close();
        br.close();

    }
}
