package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_3009 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[][] = new int[3][2];

		for (int i = 0; i < 3; i++) {

			String input[] = br.readLine().split(" ");

			arr[i][0] = Integer.parseInt(input[0]);
			arr[i][1] = Integer.parseInt(input[1]);

		}

		int x;
		int y;
		int cnt;

		int index = 0;

		while (true) {
			cnt = 0;
			x = arr[index][0];
			for (int i = 0; i < 3; i++) {
				if (x == arr[i][0]) {
					cnt++;
				}
			}
			if (cnt == 1) {
				break;
			} else {
				index++;
			}
		}
		
		index = 0;

		while (true) {
			cnt = 0;
			y = arr[index][1];
			for (int i = 0; i < 3; i++) {
				if (y == arr[i][1]) {
					cnt++;
				}
			}
			if (cnt == 1) {
				break;
			} else {
				index++;
			}
		}
		System.out.println(x + " " + y);
	}
}
