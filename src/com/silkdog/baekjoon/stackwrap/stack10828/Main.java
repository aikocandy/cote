package com.silkdog.baekjoon.stackwrap.stack10828;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        int number = 0;
        String[] str;

        for (int i = 0; i < size; i++) {
            str = br.readLine().split(" ");
            if (str.length >= 2) number = Integer.parseInt(str[1]);
            switch (str[0]) {
                case "push":
                    stack.push(number);
                    break;
                case "pop": {
                    if (stack.size() <= 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                        stack.pop();
                    }
                    break;
                }
                case "size":{
                    sb.append(stack.size()).append("\n");
                    break;
                }
                case "empty":{
                    sb.append(stack.size() <= 0 ? 1 : 0).append("\n");
                    break;
                }
                case "top": {
                    if (stack.size() <= 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
                }

            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
