package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9184 {
	
	static Integer dp[][][];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp = new Integer[21][21][21];
		
		while(true) {
			
			String input[] = br.readLine().split(" ");
			
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			} else {
				System.out.println("w("+a+", "+b+", "+c+") = " + W(a,b,c));
			}
		}
	}

	private static Integer W(int a,int b, int c) {
		
		if(a <= 0 || b <= 0 || c <= 0) return 1;
		else if ( a > 20 || b > 20 || c > 20) return W(20,20,20);
		
		if(dp[a][b][c] == null) {
			if ( a < b && b < c) return dp[a][b][c] = W(a,b,c-1) + W(a,b-1,c-1) - W(a,b-1,c);
			else return dp[a][b][c] = W(a-1,b,c) + W(a-1,b-1,c) + W(a-1,b,c-1) - W(a-1,b-1,c-1);
		} else {
			return dp[a][b][c];
		}
	}
}
