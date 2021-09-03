package com.silkdog.cotehistory.rabbidavidkaye;

import java.util.Arrays;

public class ThreeNPlusOne {

    static int[] memo = new int[100001];

    public static void main(String[] args) {
        int start = 1;
        int end = 30;
        int max = Integer.MIN_VALUE, cnt = 0, target = 0;
        Arrays.fill(memo, 0);

        for (int i = start; i <= end; i++) {
            cnt = memoize(i);
            if (max < cnt) {
                max = cnt;
                target = i;
            }
        }

        System.out.printf("%d: %d", target, max);
    }

    public static int memoize(int idx) {
        int cnt = 1;
        int tmp = idx;
        while (idx != 1) {
            if (idx % 2 == 0) {
                idx /= 2;
            } else {
                idx *= 3;
                idx += 1;
            }

            if (idx < 100001 && memo[idx] != 0) {
                memo[tmp] = memo[idx] + cnt;
                return memo[tmp];
            }
            cnt++;
        }
        memo[tmp] = cnt;  // 계산된 적이 없다면 메모이제이즈
        return cnt;
    }


}


