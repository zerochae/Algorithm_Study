package com.zerochae.kakao.BlindRecruitment2022;

import java.util.Stack;

public class Kakao_Blind_2022_02 {

	static boolean prime[] = new boolean[1_000_001];

	public static void main(String[] args) {

		int n = 110011;
		int k = 10;
		System.out.println(solution(n, k));

	}

	public static int solution(int n, int k) {
		
		int result = 0;

		Stack<Integer> stack = new Stack<>();
		while (n >= 1) {

			int oper = n % k;
			n = n / k;
			stack.push(oper);
		}
		String number = "";
		while (!stack.isEmpty()) {
			number += stack.pop();
		}
		isPrime(prime);
		if (!number.contains("0")) {
			int index = Integer.parseInt(number);
			if (!prime[index])
				result++;
		} else {
			
			while(number.contains("00")) {
				number = number.replace("00", "0");
			}
			
			String numbers[] = number.split("0");

			for (int i = 0; i < numbers.length; i++) {
				
					int index = Integer.parseInt(numbers[i]);
					if (!prime[index])
						result++;
			}
		}
		return result;

	}

	public static boolean[] isPrime(boolean prime[]) {

		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {

			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

		return prime;
	}
}
