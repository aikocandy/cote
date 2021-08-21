package com.silkdog.baekjoon.queuewrap.queue18258;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String command;
        int val;
        int size = Integer.parseInt(br.readLine());
        List<Integer> queue = new LinkedList<>();

        for(int i = 0; i < size; i++){
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();

            switch(command){
                case "push":{
                    val = Integer.parseInt(st.nextToken());
                    queue.add(val);
                    break;
                }
                case "pop":{
                    val = queue.size() <= 0 ? -1 : queue.get(0);
                    if(val != -1) queue.remove(0);
                    sb.append(val).append("\n");
                    break;
                }
                case "front":{
                    val = queue.size() <= 0 ? -1 : queue.get(0);
                    sb.append(val).append("\n");
                    break;
                }
                case "back":{
                    val = queue.size() <= 0 ? -1 : queue.get(queue.size()-1);
                    sb.append(val).append("\n");
                    break;
                }
                case "empty":{
                    val = queue.size() <= 0 ? 1 : 0;
                    sb.append(val).append("\n");
                    break;
                }
                case "size":{
                    sb.append(queue.size()).append("\n");
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
