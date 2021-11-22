package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_13699 {
	
	public static long dp[];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new long[n+1];
		dp[0] = 1L;
		for(int i =0; i<n+1; i++) {
			for(int j = 0; j<i; j++) {
				dp[i] += dp[j] * dp[i-1-j];
			}
		}
		System.out.println(dp[n]);
		br.close(); 
	}
}
