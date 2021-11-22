package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2156 {
	
	static Integer dp[];
	static Integer wine[];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n+1];
		wine = new Integer[n+1];
		
		for(int i =1; i<=n; i++) {
			wine[i] = Integer.parseInt(br.readLine());
		} 
		
		dp[0] = 0;
		dp[1] = wine[1];
		
		if(n > 1) {
			dp[2] = wine[1]+wine[2];
		}
		
		System.out.println(solve(n));
	}

	private static int solve(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(solve(n-2), solve(n-3) + wine[n-1]) + wine[n];
			dp[n] = Math.max(dp[n], solve(n-1));
		}
		
		return dp[n];
	}

}
