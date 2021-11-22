package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_14606 {

	static Integer dp[];

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		dp = new Integer[n + 1];

		dp[1] = 0;
		dp[2] = 1;
		
		for(int i =3; i<=n; i++) {
		dp[i] = dp[i-1] + (i-1);
		}
		
		System.out.println(dp[n]);
	}
}
