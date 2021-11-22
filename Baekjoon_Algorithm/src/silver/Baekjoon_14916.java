package silver;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_14916 {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] dp = new int[100001];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[2] = dp[5] = 1;
		dp[4] = 2;

		for (int i = 6; i <= N; i++) {
			dp[i] = Math.min(dp[i - 2], dp[i - 5]) + 1;
		}

		System.out.println(dp[N] == Integer.MAX_VALUE ? -1 : dp[N]);
		sc.close();
	}
}
