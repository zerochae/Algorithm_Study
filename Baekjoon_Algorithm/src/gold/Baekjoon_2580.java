package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2580 {

	static int arr[][] = new int[9][9];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < arr.length; i++) {
			String input[] = br.readLine().split(" ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}

		dfs(0, 0);

	}

	private static void dfs(int row, int col) {
		
		if(col == 9) {
			dfs(row+1,0);
			return;
		}

		if (row == 9) {
			// 출력 !!!
			for (int i = 0; i < arr.length; i++) {
				for (int value : arr[i]) {
					System.out.print(value + " ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		
		if(arr[row][col] == 0) { //0인 원소 탐색
			
			for( int i = 1; i<=9; i++) { // 0인 원소에 1~9부터 가능한 수 탐색
				
				if(possible(row, col, i)) {
					arr[row][col] = i; // 찾았음
					dfs(row,col+1); // 다음꺼 탐색하러 ㄱㄱㄱ
				}
			}
			arr[row][col] = 0; // 없으면 그냥 냅둬
			return;
		}
		dfs(row,col+1); // 다음꺼 탐색하러 ㄱㄱㄱ
	}

	private static boolean possible(int row, int col, int value) {
		
		for(int i = 0; i< 9; i++) { // 행에 같은 수가 있는지 검사
			if(arr[row][i] == value) {
				return false;
			}
		}
		
		for(int i = 0; i<9; i++) { // 열에 같은 수가 있는지 검사
			if(arr[i][col] == value) {
				return false;
			}
		}
		
		// 3*3칸에 같은 수가 있는지 검사
		
		int set_row = (row/3) * 3; // 3*3 칸에 시작 좌표 (0,0)
		int set_col = (col/3) * 3; // 3*3 칸에 시작 좌표 (0,0)
		
		for(int i = set_row; i<set_row+3/* 0부터 시작하니까 3까지*/; i++) {
			for(int j = set_col; j <set_col+3/* 0부터 시작하니까 3까지*/; j++) {
				if(arr[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
}
