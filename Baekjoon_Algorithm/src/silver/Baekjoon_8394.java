package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_8394 {
	
	static Long dp[] = new Long[10000001];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   
		
		int n = Integer.parseInt(br.readLine());
		
		dp[0] = 1L;
		dp[1] = 1L;
		dp[2] = 2L;
		
		System.out.println(solve(n));
	}

	private static long solve(int n) {
//		if(n < 2) dp[n] = 1L;
//		if(dp[n] == null && n >= 2)
//		dp[n] = (solve(n-1)%10 + solve(n-2)%10)%10;
		
		for(int i =3; i<=n; i++) {
			dp[i] = (dp[i-1]%10 + dp[i-2]%10) % 10;
		}
		return dp[n];
	}
}
