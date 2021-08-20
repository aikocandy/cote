package com.silkdog.baekjoon.nocategory.nocate1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long fixed = Long.parseLong(st.nextToken());
        long per =  Long.parseLong(st.nextToken());
        long price =  Long.parseLong(st.nextToken());
        int cnt = 1;

        if(per > price){
            System.out.println(-1);
            System.exit(0);
        }

        System.out.println((int)(Math.log10(fixed)+1));

//        while((per * cnt) > (price * cnt) - fixed){
//            cnt++;
//        }

        System.out.println(++cnt);
    }
}
