package com.zerochae.kakao.BlindRecruitment2018;

import java.util.regex.Pattern;

public class Dart_lv1_30_17682 {

    static int result;
    static int resultMap[] = new int[3];

    public static void main(String[] args) {

        String input = "1S2D*3T";

        System.out.println(solution(input));

    }

    public static int solution(String dartResult) {

        /*

        if value => 숫자면 숫자로
        else if value => 영어면 더블
        else value = 특수문자


         */

        String score = "^[0-9]*$";
        String bonus = "^[A-Z]*$";
        String event = "[#*]";

        int index = 0;

        while (index < 3) {


            for (int i = 0; i < dartResult.length(); i++) {

                String input = String.valueOf(dartResult.charAt(i));

                int n = 0;

                if (regex(score, input)) {
                    n = Integer.parseInt(input);
                } else if (regex(bonus, input)) {
                    switch (input) {
                        case "S":
                            break;
                        case "D":
                            n *= n;
                            break;
                        case "T":
                            n *= n * n;
                            break;
                    }
                } else if (regex(event, input)) {
                    switch (input) {
                        case "#":
                            n *= -1;
                            break;
                        case "*":

                            if (index == 0) {


                            } else {

                            }

                            break;
                    }
                }
                resultMap[index] = n;
            }
            index++;
        }
        return result;
    }

    static boolean regex(String category, String input) {
        return Pattern.matches(category, input);
    }

}
