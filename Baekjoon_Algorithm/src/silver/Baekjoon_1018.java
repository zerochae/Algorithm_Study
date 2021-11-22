package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1018 {

	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		int row = n-7;
		int col = m-7;
		
		for(int i =0; i<row; i++) {
			for(int j =0; j<col; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
		
	}

	private static void find(int x, int y) {
		int endX = x+8;
		int endY = y+8;
		int cnt = 0;
		
		boolean TF = arr[x][y];
		
		for(int i =x; i<endX; i++) {
			for(int j =y; j<endY; j++) {
				
				if(arr[i][j] != TF) {
					cnt++;
				}
				
				TF = (!TF);
			}
			TF = (!TF);
		}
		
		cnt = Math.min(cnt, 64-cnt);
		
		min = Math.min(min, cnt);
	}

}
