package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_6395 {

	static Integer arr[][];
	static int n;
	static int k;

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);
		
		arr = new Integer[n+1][k+1];
		
		System.out.println(solve(n,k));
		
	}
	
	static int solve(int x, int y) {
		if(x == y || y == 1) return arr[x][y] = 1;
		if(arr[x][y] == null) arr[x][y] = solve(x-1,y-1) + solve(x-1,y);
		
		return arr[x][y]; 
	}

}
