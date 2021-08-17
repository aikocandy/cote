package com.silkdog.baekjoon.arraywrap.array10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
        모범답안 C++17 미친거 같다
        #include <cstdio>
        #include <sys/stat.h>
        #include <sys/mman.h>
        int z[36];char*c=(char*)mmap(0,z[12],1,2,0,fstat(0,(struct stat*)z));
        int main() {
            int N=0, a=1e6, b=-1e6;
            do N=N*10+*c-'0';while(*++c>='0');++c;
            while(N--) {
                int x=0;bool e;c+=e=*c=='-';do x=x*10+*c-'0';while(*++c>='0');++c;x=e?-x:x;
                a=a<x?a:x, b=b>x?b:x;
            }
            printf("%d %d", a, b);
        }
    * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int big = Integer.parseInt(arr[0]), small = Integer.parseInt(arr[0]), tmp;
        for(int i = 0 ; i < size; i++){
            tmp = Integer.parseInt(arr[i]);
            if(i == 0){
                big = tmp;
                small = tmp;
            }else{
                if (tmp > big) big = tmp;
                if (tmp < small) small = tmp;
            }
        }

        System.out.printf("%d %d%n", small, big);
    }
}
