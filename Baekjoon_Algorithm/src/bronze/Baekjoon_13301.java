package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_13301 {
	   
	static Long dp[];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Long[n+1];
		
		System.out.println((Tile(n) + Tile(n) + Tile(n-1)) * 2);
	}
	
	static Long Tile(int n) {
		
		dp[0] = 0L;
		if(n >= 1) dp[1] = 1L;
		if(dp[n] == null)
		dp[n] = Tile(n-1) + Tile(n-2);
		return dp[n];
	}
}
