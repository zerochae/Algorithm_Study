package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_17626 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		/*
		 
		 1 -> 1^2 -> 1개
		 2 -> 1^2 + 1^2 -> 2개
		 3 -> 1^2 + 1^2 + 1^2 -> 3개
		 4 -> 2^2 -> 1개
		 5 -> 2^2 + 1^2 -> 2개
		 6 -> 2^2 + 1^2 + 1^2 -> 3개
		 7 -> 2^2 + 1^2 + 1^2 + 1^2 -> 4개
		 8 -> 2^2 + 2^2 -> 2개
		 9 -> 3^3 -> 1개
		 
		 
		 dp[i] = min(dp[i-j * j]) +1
		 
		 -----------------------------------
		
		dp[1] = 1;
		dp[2] = dp[1] + 1 = 2;
		dp[3] = dp[2] + 1 = 3;
		dp[4] = 1;
		dp[5] = dp[2^2] + 1 = 2;
		dp[6] = dp[2^2] + dp[2] = 3;
		
	
		
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int dp[] = new int[n+1];
		
		dp[1] = 1;
		
		int min = 0;
		for(int i = 2; i<= n; i++) {
			min = Integer.MAX_VALUE;
			
			for(int j = 1; j*j<=i; j++) {
				int temp = i-j*j;
				min = Math.min(min, dp[temp]);
			}
			dp[i] = min + 1;
		}
		bw.write(dp[n] + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}
