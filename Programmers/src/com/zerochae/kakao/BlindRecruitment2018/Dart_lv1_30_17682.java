package com.zerochae.kakao.BlindRecruitment2018;

import java.util.regex.Pattern;

public class Dart_lv1_30_17682 {

    public static void main(String[] args) {

        String input = "0D0S#10S";
        System.out.println(solution(input));

    }

    public static int solution(String dartResult) {

        int totalResult = 0;
        int[] result = new int[3];
        Integer[] score = new Integer[3];
        String[] bonus = new String[3];
        String[] event = new String[3];
        String scoreReg = "^[0-9]*$";
        String bonusReg = "^[A-Z]*$";
        String eventReg = "[#*]";
        int index = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            String input = String.valueOf(dartResult.charAt(i));

            if (regex(scoreReg, input)) {
                if (score[0] != null) {
                    index++;
                }
                int num = Integer.parseInt(input);
                if (Integer.parseInt(input) == 1) {
                    String test = String.valueOf(dartResult.charAt(i + 1));
                    if (!regex(bonusReg, test)) {
                        num = 10;
                        i++;
                    }
                }
                score[index] = num;
            } else if (regex(bonusReg, input)) {
                bonus[index] = input;
            } else if (regex(eventReg, input)) {
                event[index] = input;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (event[i] == null) {
                event[i] = "";
            }
        }

        for (int i = 0; i < 3; i++) {
            int tempScore = 0;
            switch (bonus[i]) {
                case "S":
                    tempScore = score[i];
                    break;
                case "D":
                    tempScore = score[i] * score[i];
                    break;
                case "T":
                    tempScore = score[i] * score[i] * score[i];
                    break;
            }
            switch (event[i]) {
                case "*":
                    if (i > 0) result[i - 1] *= 2;
                    tempScore *= 2;
                    break;
                case "#":
                    tempScore *= -1;
                    break;
            }
            result[i] = tempScore;
        }

        for (int i = 0; i < 3; i++) {
            totalResult += result[i];
        }
        return totalResult;
    }

    static boolean regex(String category, String input) {
        return Pattern.matches(category, input);
    }
}
