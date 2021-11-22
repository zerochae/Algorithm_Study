package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15650 {
	
	static boolean visit[];
	static int arr[];
	static int m;
	static int n;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input[] = br.readLine().split(" ");
		
		n = Integer.parseInt(input[0]); // 1에서 n까지의 자연수
		m = Integer.parseInt(input[1]); // 길이가 m
		
		arr = new int[m];
		
		visit = new boolean[n+1];
		
		dfs(0);
		
		System.out.println(sb.toString());
		
	}

	private static void dfs(int depth) {
		
		if(depth == m) { // 깊이와 길이가 같아지면
			
			for(int i =0; i<arr.length; i++) {
				sb.append(arr[i]).append(" "); // 배열의 value를 담고
			}
				sb.append("\n"); // 줄바꾸고 다음 배열 받음`
				return;
		}
		
		for(int i =1; i<=n; i++) {
			
			if(!visit[i]) {
				
				arr[depth] = i;
				visit[i] = true;
				dfs(depth+1);
				
				for(int j = i+1; j<=n; j++) {
					visit[j] = false;
				}
			}
		}
	}
}
