package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10709 {

	static Integer dp[][];
	static Boolean arr[][];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input[] = br.readLine().split(" ");

		int h = Integer.parseInt(input[0]);
		int w = Integer.parseInt(input[1]);

		dp = new Integer[h + 1][w + 1];
		arr = new Boolean[h + 1][w + 1];

		for (int i = 1; i <= h; i++) {
			String input2[] = br.readLine().split("");
			for (int j = 1; j <= w; j++) {
				if (input2[j - 1].equals("c")) {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print(solve(i, j) + " ");
			}
			System.out.println();
		}
	}

	private static int solve(int h, int w) {
		
		if(w == 1) {
			if(arr[h][w] == true) dp[h][w] = 0;
			else dp[h][w] = -1;
		}
		if(w > 1) {
			if(arr[h][w] == true) dp[h][w] = 0;
			else {
				if(dp[h][w-1] != -1) {
					dp[h][w] = solve(h,w-1) + 1;
				} else {
					dp[h][w] = -1;
				}
			}
		}
		return dp[h][w];
	}
}

