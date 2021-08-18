package com.silkdog.baekjoon.recurwrap.recur10872;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /*
        모범답안.. 근데 이건 재귀가 아니다. 그냥 박제...
        public static int mul(int n) {
            int mul=1;
            for(int i=1;i<=n;i++) {
                mul=mul*i;
            }


            return mul;

        }
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        recur(size, 1);
    }

    public static void recur(int size, int sum){
        if(size <= 0){
            System.out.println(sum);
        }else{
            sum *= size--;
            recur(size, sum);
        }
    }

}
