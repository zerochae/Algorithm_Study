package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_19947 {

	static int dp[];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input[] = br.readLine().split(" ");
		
		int h = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		
		dp = new int[y+1];
		dp[0] = h;
		for(int i =1; i<=y; i++) {
			dp[i] = (int) (dp[i-1] * 1.05);
			if(i >= 3) dp[i] = Math.max(dp[i], (int)(dp[i-3] * 1.2));
			if(i >= 5) dp[i] = Math.max(dp[i], (int)(dp[i-5] * 1.35));
		}
		System.out.print(dp[y]);
	}
}
