package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9095 {
	
	static Integer dp[];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp = new Integer[11];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		for(int i = 4; i<=10; i++) {
			dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i =1; i<=t; i++) {
			
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp[n]);
		}
	}
}
