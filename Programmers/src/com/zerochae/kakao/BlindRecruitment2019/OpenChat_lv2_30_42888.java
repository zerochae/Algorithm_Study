package com.zerochae.kakao.BlindRecruitment2019;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OpenChat_lv2_30_42888 {

    public static void main(String[] args) {

        String[] record = {};

        System.out.println(Arrays.toString(solution(record)));

    }

    public static String[] solution(String[] record) {

        int length = 0; // 결과를 담을 배열의 길이

        Map<String, String> nameMap = new HashMap<>();

        for (String s : record) {

            String[] member = s.split(" "); // act0 uid1 nickname2

            String act = member[0];
            String uId = member[1];

            if (act.charAt(0) == 'E') {
                String nickName = member[2];
                nameMap.put(uId, nickName);

            } else if (act.charAt(0) == 'C') {
                String nickName = member[2];
                nameMap.put(uId, nickName);
                length++;
            }
        }

        String[] result = new String[record.length - length];

        int index = 0;

        for (String s : record) {

            if (s.split(" ")[0].charAt(0) == 'E') {
                result[index] = nameMap.get(s.split(" ")[1]) + "님이 들어왔습니다.";
                index++;
            } else if (s.split(" ")[0].charAt(0) == 'L') {
                result[index] = nameMap.get(s.split(" ")[1]) + "님이 나갔습니다.";
                index++;
            }
        }
        return result;
    }
}
