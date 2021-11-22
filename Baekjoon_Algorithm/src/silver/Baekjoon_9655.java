package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9655 {
	
	static Boolean dp[];

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
	
		dp = new Boolean[n+1];
		dp[1] = true;
		dp[2] = false;
		
		String result = "";

		if (solve(n)) {
			result = "CY";
		} else {
			result = "SK";
		}
		System.out.println(result);
	}
	
	static boolean solve(int n) {

		if(dp[n] == null) {
			dp[n] = !(solve(n-1));
		}
		return dp[n];
	}
}