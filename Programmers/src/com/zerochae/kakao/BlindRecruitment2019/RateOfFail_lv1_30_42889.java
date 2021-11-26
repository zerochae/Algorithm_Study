package com.zerochae.kakao.BlindRecruitment2019;

import java.util.Arrays;

public class RateOfFail_lv1_30_42889 {

    public static void main(String[] args) {
        int N = 4;
        int[] arr = {1,2,3,2,1};
        // 3 2 1 4
        System.out.println(Arrays.toString(solution(N, arr)));
    }
    // 1 , 6 , 7,  9 , 13 , 23 , 24 ,25
    public static int[] solution(int N, int[] stages) {
        int[] result = new int[N];
        double[] rate = new double[N];
        double down = stages.length;
        int nowStage = 1;

        for (int i = 0; i < rate.length; i++) {
            double up = 0;
            for (int stage : stages) {
                if (nowStage == stage) {
                    up++;
                }
            }
            if ( up == 0){
              rate[i] = 0;
            } else {
                rate[i] = up / down;
            }
            down -= up;
            nowStage++;
        }

        int[] answer = new int[N];
        for (int i = 0; i < result.length; i++) {
            int index = 0;
            double MAX = Integer.MIN_VALUE;
            for (int j = 0; j < result.length; j++) {
                if (MAX < rate[j] && MAX != rate[j]) {
                    MAX = rate[j];
                    index = j+1;
                }
            }
            rate[index-1] = -1;
            answer[i] = index;
        }
        return answer;
    }
}
