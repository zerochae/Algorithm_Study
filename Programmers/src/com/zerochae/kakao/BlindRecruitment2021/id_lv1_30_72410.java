package com.zerochae.kakao.BlindRecruitment2021;

import java.util.ArrayList;
import java.util.List;

public class id_lv1_30_72410 {

	public static void main(String[] args) {

		String input = "";

		// 1단계 : 대문자를 소문자로 치환

		char[] arr = input.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if ((int) arr[i] > 64 && (int) arr[i] < 91) {
				arr[i] = (char) (arr[i] + 32);
			}
		}

		List<Character> list = new ArrayList<Character>();

		// 2단계 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
		// 0 = 48 , 9 = 57 , a= 97 z = 122 , - = 45 , _=95 , .=46;

		for (int i = 0; i < arr.length; i++) {

			if (((int) arr[i] > 47 && (int) arr[i] < 58)) {
				list.add(arr[i]);
			} else if ((int) arr[i] > 96 && (int) arr[i] < 123) {
				list.add(arr[i]);
			} else if ((int) arr[i] == 45) {
				list.add(arr[i]);
			} else if ((int) arr[i] == 95) {
				list.add(arr[i]);
			} else if ((int) arr[i] == 46) {
				list.add(arr[i]);
			} else {
				continue;
			}
		}

		// 3단계 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표로 치환
		input = "";

		for (int i = 0; i < list.size(); i++) {
			input += list.get(i);
		}

		while (input.contains("..")) {
			input = input.replace("..", ".");
		}

		// 4단계 마침표(.)가 처음이나 끝에 위치한다면 제거
		if (input.length() != 0) {
			if (input.charAt(0) == '.') {
				if (input.length() == 1) {
					input = "";
				} else {
					input = input.substring(1, input.length());
				}
			}
		}
		if (input.length() != 0) {
			if (input.charAt(input.length() - 1) == '.') {
				if (input.length() == 1) {
					input = "";
				} else {
					input = input.substring(0, input.length() - 1);
				}
			}
		}

		// 5단계 빈 문자열이라면, a 대입
		if (input.length() == 0) {
			input = "a";
		}

		// 6단계 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 제거, 제거 후 마침표가 마지막글자라면 제거

		if (input.length() >= 16) {
			input = input.substring(0, 15);

			if (input.charAt(input.length() - 1) == '.') {
				input = input.substring(0, 14);
			}
		}

		// 7단계 길이가 2자 이하라면 마지막 문자를 3이 될 까지 추가
		while (input.length() <= 2) {
			input += input.charAt(input.length() - 1);
		}

	}

}
