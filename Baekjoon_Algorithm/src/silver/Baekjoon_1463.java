package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1463 {

		static Integer[] dp;
	
	
	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		
		dp = new Integer[x+1];
		dp[0] = dp[1] = 0;
		
		System.out.println(solve(x));

		
	}
	static int solve(int n) {
		
		if(dp[n] == null) {
			
			if(n % 6 == 0) {
				dp[n] = Math.min(solve(n-1), Math.min(solve(n/3), solve(n/2))) + 1;
			}
			else if(n % 3 == 0) {
				dp[n] = Math.min(solve(n/3), solve(n-1)) + 1;
			}
			else if(n % 2 == 0) {
				dp[n] = Math.min(solve(n/2), solve(n-1)) + 1;
			}
			else{
				dp[n] = solve(n-1) + 1;
			}
		}
		
		return dp[n];
	}
}
