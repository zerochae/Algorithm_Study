package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Baekjoon_1764 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input[] = br.readLine().split(" ");
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		for (int i = 0; i < m; i++) {
			String name = br.readLine();
			if (set.contains(name)) {
				list.add(name);
			}
		}
		Collections.sort(list);
		for (String s : list) {
			sb.append(s).append('\n');
		}
		System.out.println(list.size());
		System.out.println(sb);
	}
}
