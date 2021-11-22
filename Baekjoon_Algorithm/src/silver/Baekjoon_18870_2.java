package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Baekjoon_18870_2 {
 

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			map.put(Integer.parseInt(input[i]), 0);
		}

		for (int i = 0; i < n; i++) {
			int temp = Integer.MAX_VALUE;
			if (map.containsKey(Integer.parseInt(input[i])) && map.get(Integer.parseInt(input[i])) != 0) {
				sb.append(map.get(Integer.parseInt(input[i])) + " ");
				continue;
			} else {
				for (int j = 0; j < n; j++) {

					if (Integer.parseInt(input[j]) == temp) {
						continue;
					} else if (Integer.parseInt(input[i]) > Integer.parseInt(input[j])) {
						map.put(Integer.parseInt(input[i]), map.get(Integer.parseInt(input[i])) + 1);
						temp = Integer.parseInt(input[j]);
					}
				}
			}
			sb.append(map.get(Integer.parseInt(input[i])) + " ");
		}
		System.out.print(sb.toString());
	}
}
