package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2670 {
	
	static double dp[];
	static double arr[];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new double[n+1];
		arr = new double[n+1];
		
		for(int i =1; i<=n; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		   
		double result = 0; 
		double max = 0;
		for(int i =1; i<=n; i++) {
			max = arr[i];
			dp[i] = Math.max(dp[i], max);
			for(int j=i+1; j<=n; j++) {
				max *= arr[j];
				dp[i]= Math.max(dp[i], max);
			}
			result = Math.max(result, dp[i]);
		}
		
		System.out.printf("%.3f",result);
		
	}
}
