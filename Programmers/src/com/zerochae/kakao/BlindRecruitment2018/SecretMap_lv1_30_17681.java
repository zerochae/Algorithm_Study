package com.zerochae.kakao.BlindRecruitment2018;

import java.util.Arrays;

public class SecretMap_lv1_30_17681 {

    static String[][] resultMap;
    static String[] resultArr;

    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};

        System.out.println(Arrays.toString(solution(n, arr1, arr2)));

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {

        resultMap = new String[n][n];
        resultArr = new String[n];

        insertMap(arr1,n);
        insertMap(arr2,n);
        makeResult(resultMap);
        return resultArr;
    }

    public static String binary(int n,int length) {

        String result = "";
        while (n > 1) {
            result = String.format("%d%s", n % 2, result);
            n /= 2;
        }
        if (n == 1) {
            result = "1" + result;
        }
        while(result.length() < length){
            result = String.format("0%s", result);
        }
        return result;
    }

    public static void insertMap(int[] arr,int length) {
        int index = 0;

        for (int value : arr) {

            String input = String.valueOf(value);
            String[] inputArr = binary(Integer.parseInt(input),length).split("");


            for (int i = 0; i < inputArr.length; i++) {
                if (resultMap[index][i] == null) {

                    if (inputArr[i].equals("1")) {
                        resultMap[index][i] = "#";
                    } else {
                        resultMap[index][i] = " ";
                    }

                } else {

                    if (inputArr[i].equals("1")) {
                        resultMap[index][i] = "#";
                    }
                }
            }
            index++;
        }
    }

    static void makeResult(String[][] arr){

        int index = 0;

        for(String[] value : arr){
            StringBuilder str = new StringBuilder();
            for(int i = 0; i< value.length; i++) str.append(arr[index][i]);
            resultArr[index] = str.toString();
            index++;
        }
    }
}