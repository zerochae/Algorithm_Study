package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_4948 {

	// 출력초과 2 오답 5

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {

			int n = Integer.parseInt(br.readLine());
			int cnt = 0;

			if (n == 0) {
				System.out.println(sb);
				break;
			}

			if (n <= 2) {
				cnt++;

			} else {
				for (int i = n + 1; i <= (int) n * 2; i++) {
					loop: for (int j = 2; j <= (int) Math.sqrt(i); j++) {
						if (i % j == 0) {
							break loop;
						} else {

							if (j == (int) Math.sqrt(i)) {
								cnt++;
							}
						}
					}
				}
			}
			sb.append(cnt + "\n");
		}
	}
}
