package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15649_2 {
	
	static int arr[];
	static boolean visit[];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		arr = new int[m];
		visit = new  boolean[n];
		
		dfs(n , m , 0);
		
		System.out.println(sb.toString());
		
	}
	
	public static void dfs(int n , int m ,int d) {
		
		if(d == m) {
			for (int val : arr)  {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i =0; i<n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[d] = i+1;
				dfs(n, m, d+1);
				visit[i] = false;
			}
		}
		
	}

}
