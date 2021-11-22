package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_11053 {
	
	static Integer arr[];
	static Integer dp[];

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		arr = new Integer[n];
		dp = new Integer[n];

		String input[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		for (int i = 0; i < n; i++) {
			solve(i);
		}

		int max = dp[0];

		for (int i = 0; i < n; i++) {
			max = dp[i] > max ? dp[i] : max;
		}
		System.out.println(max);
	}

	private static int solve(int n) {
		if (dp[n] == null) {
			dp[n] = 1;
			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] < arr[n]) {
					dp[n] = Math.max(dp[n], solve(i) + 1);
				}
			}
		}
		return dp[n];
	}
}
