package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14501 {

	static int dp[];
	static int arr[][];

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		dp = new int[n + 2];
		arr = new int[n + 2][2];
		int max = 0;
		for (int i = 1; i <= n; i++) {
			String input[] = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(input[0]); // 시간 (TIME)
			arr[i][1] = Integer.parseInt(input[1]); // 수익 (PAY)
		}
		
		for(int i =1; i<n+2; i++) {
			
			if(max < dp[i]) {
				max = dp[i];
			}
			int day = i + arr[i][0];
			if(day < n + 2) {
				dp[day] = Math.max(dp[day], max + arr[i][1]);
			}
		}
		System.out.println(max);
	}
}
