package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1904 {

	static Integer dp[];

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		dp = new Integer[1000001];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;

		System.out.println( solution(n)  );

	}
 
	private static Integer solution(int n) {
		
		if(dp[n] == null) {
			dp[n] = (solution(n-1) + solution((n-2))) % 15746;
		}
		return dp[n];
	}
}
