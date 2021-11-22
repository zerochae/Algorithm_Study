package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2748 {

	static Long dp[];
	static final int MOD = 1_000_000;

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		dp = new Long[n + 1];
		
		

		System.out.println(solution(n));
	}

	static long solution(int n) {
		dp[0] = 0L;
		if(n >= 1) dp[1] = 1L;
		if(dp[n] == null) dp[n] = solution(n-1) + solution(n-2);
		return dp[n];
	}
}
