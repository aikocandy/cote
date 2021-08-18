package com.silkdog.baekjoon.strwrap.str2675;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{


        // TODO: 못풀었음...

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; int time;
        int size = Integer.parseInt(br.readLine());
        StringBuilder sb;
        String allowed = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\\$%*+-./";
        List<StringBuilder> lst = new ArrayList<>();

        for(int x= 0 ; x < size; x++){
            st = new StringTokenizer(br.readLine()); sb = new StringBuilder();
            time = Integer.parseInt(st.nextToken());

            char[] str = st.nextToken().toCharArray();
            int len = Math.min(str.length, 20);
            char[] c = new char[len];
            for(int i = 0; i < len; i++){
                c[i] = str[i];
            }

            for(int i = 0 ; i < c.length; i++){
                for(int j = 0; j < time; j++){
                    if(!allowed.contains(String.valueOf(c[i]))){break;}
                    sb.append(c[i]);
                }
            }

            lst.add(sb);
        }

        br.close();

        for(int i = 0; i < lst.size(); i++){
            System.out.println(lst.get(i).toString());
        }
    }
}
