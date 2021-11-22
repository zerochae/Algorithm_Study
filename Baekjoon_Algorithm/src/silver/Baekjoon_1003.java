package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1003 {
	
	static Integer[][] dp = new Integer[41][2];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			
			int n = Integer.parseInt(br.readLine());
			solution(n);
			sb.append(dp[n][0] + " " + dp[n][1]).append('\n');
		}
		System.out.println(sb);
	}
	
	public static Integer[] solution(int n) {
		
		 
		if(dp[n][0] == null || dp[n][1] == null) {
			dp[n][0] = solution(n-1)[0] + solution(n-2)[0];
			dp[n][1] = solution(n-1)[1] + solution(n-2)[1];
		 }
		return dp[n];
	}
}
