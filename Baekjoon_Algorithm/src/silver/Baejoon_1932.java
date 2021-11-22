package silver;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Baejoon_1932 {
	
	static Integer dp[][];
	static Integer arr[][];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		arr= new Integer[n+1][n+1];
		dp = new Integer[n+1][n+1];
		
		
		
		for(int i = 1; i<=n; i++) {
				String input[] = br.readLine().split(" ");
				dp[i][0] = dp[i-1][0] + arr[1][0];
				
			for(int j = 1; j<=i; j++) {
				arr[i][j] = Integer.parseInt(input[j-1]);
				
			}
		}
	}
}
