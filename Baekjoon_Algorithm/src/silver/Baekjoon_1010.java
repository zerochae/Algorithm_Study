package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1010 {
	
	static Integer dp[][] = new Integer[30][30];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		
		while(t --> 0) {
		String num[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);
		
		System.out.println(solve(m,n));
		}
	}

	private static int solve(int n, int m) {

		if(m == n || m == 0) {
			dp[n][m] = 1;
		}
		if(dp[n][m] == null)
		dp[n][m] = solve(n-1,m-1) + solve(n-1,m);
		return dp[n][m];
	}
}
