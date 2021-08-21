package com.silkdog.baekjoon.queuewrap.queue10866;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    /**
     * No: 10866
     * Description: 정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
     */


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>(Integer.parseInt(br.readLine()));
        for (String str = br.readLine(); str != null; str = br.readLine()) {

            switch (str.split(" ")[0]) {
                case "push_back":
                    deque.addLast(Integer.parseInt(str.split(" ")[1]));
                    break;
                case "push_front":
                    deque.addFirst(Integer.parseInt(str.split(" ")[1]));
                    break;
                case "front":
                    if (!deque.isEmpty()) {
                        bw.write(deque.getFirst() + "\n");
                    } else {
                        bw.write("-1" + "\n");
                    }
                    break;
                case "back":
                    if (!deque.isEmpty()) {
                        bw.write(deque.getLast() + "\n");
                    } else {
                        bw.write("-1" + "\n");
                    }
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "pop_front":
                    if (!deque.isEmpty()) {
                        bw.write(deque.getFirst() + "\n");
                        deque.removeFirst();
                    } else {
                        bw.write("-1" + "\n");
                    }
                    break;
                case "pop_back":
                    if (!deque.isEmpty()) {
                        bw.write(deque.getLast() + "\n");
                        deque.removeLast();
                    } else {
                        bw.write("-1" + "\n");
                    }
                    break;
                case "empty":
                    bw.write((deque.size() > 0 ? "0" : "1") + "\n");
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
        System.exit(0);
    }
}
