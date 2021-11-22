package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11653 {
	
	//시간초과 4스택 오답3

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		if (n == 1) {
			System.exit(0);
		} else {
			int cnt = 2;
			while (true) {

				if (n % cnt == 0) {

					n = n / cnt;
					sb.append(cnt + "\n");

					if (n == 1) {
						break;
					} else {
						cnt = 2;
					}
				} else {
					cnt++;
				}
			}
			System.out.println(sb.toString());
		}
	}
}
