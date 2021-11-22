package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2581 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		for (int i = m; i <= n; i++) {

			if (i != 1) {

				if (i == 2 || i == 3) {

					sb.append(i + " ");

				} else {

					boolean flag = true;
					for (int j = 2; j <= Math.sqrt(i); j++) {

						if (i % j == 0) {
							flag = false;
						}
						if (flag && j == (int) Math.sqrt(i)) {
							sb.append(i + " ");
						}
					}
				}
			}
		}
		
		if (sb.length() == 0) {
			System.out.println(-1);
		} else {

			String data[] = sb.toString().split(" ");
			int newdata[] = new int[data.length];
			int sum = 0;
			for (int i = 0; i < data.length; i++) {
				newdata[i] = Integer.parseInt(data[i]);
				sum += newdata[i];
			}
			System.out.println(sum);
			System.out.println(newdata[0]);
		}
	}
}
