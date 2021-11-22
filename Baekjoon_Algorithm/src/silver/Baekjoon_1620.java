package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon_1620 {
 
	public static void main(String[] args) throws Exception, IOException {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input[] = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		String arr[] = new String[n + 1];

		for (int i = 1; i <= n; i++) {
			String name = br.readLine();
			map.put(name, i);
			arr[i] = name;
		}

		for (int i = 0; i < m; i++) {
			String poke = br.readLine();
			if(isNumber(poke)) {
				int index = Integer.parseInt(poke);
				sb.append(arr[index]).append('\n');
			} else {
				sb.append(map.get(poke)).append('\n');
			}
		}
		System.out.println(sb);
	}

	public static boolean isNumber(String s) {

		try {
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}