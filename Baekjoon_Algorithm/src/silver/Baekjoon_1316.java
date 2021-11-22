package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_1316 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int cnt = 0;

		while (t-- > 0) {

			boolean flag = true;
			ArrayList<Integer> list = null;
			String input = br.readLine();

			if (input.length() == 1) {
				cnt++;
			} else {
				for (int i = 0; i < input.length(); i++) {
					list = new ArrayList<Integer>();
					char ch = input.charAt(i);

					for (int j = 0; j < input.length(); j++) {

						if (ch == input.charAt(j)) {

							list.add(j);
						}
					}
					if (list.size() == 1) {
						continue;
					} else {

						loop: for (int j = 0; j < list.size() - 1; j++) {

							if (list.get(j + 1) - list.get(j) != 1) {

								flag = false;
								break loop;
							}
						}
					}
				}
				if (flag) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		br.close();
	}
}
