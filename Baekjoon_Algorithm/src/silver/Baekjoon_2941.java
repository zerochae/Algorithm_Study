package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2941 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String input = br.readLine();

		String arr[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {

			if (input.contains(arr[i])) {

				while (input.contains(arr[i])) {
					cnt++;
					if (arr[i].length() == 2) {
						loopA: for (int j = 0; j < input.length()-1; j++) {
							for (int k = j; k < input.length(); k++) {
								if (input.substring(j, k + 1).equals(arr[i])) {
									sb.append(input);
									sb.replace(j, k + 1, " ");
									break loopA;
								}
							}
						}
					}
					if (arr[i].length() == 3) {
						loopB: for (int j = 0; j < input.length()-1; j++) {
							for (int k = j; k < input.length(); k++) {
								if (input.substring(j, k + 1).equals(arr[i])) {
									sb.append(input);
									sb.replace(j, k + 1, " ");
									break loopB;
								}
							}
						}
					}
					input = sb.toString();
					sb.delete(0, sb.length());
				}
			}

		}
		if (input.length() != 0) {
			input = input.replace(" ", "");
			for (int i = 0; i < input.length(); i++) {
				if (input.indexOf(i) != '-' || input.indexOf(i) != '=') {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
