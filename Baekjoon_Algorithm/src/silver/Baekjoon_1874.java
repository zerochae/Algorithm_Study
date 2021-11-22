package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_1874 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		ArrayList<Integer> sample = new ArrayList<Integer>(); // 만드려는 수열(비교용)
		ArrayList<Integer> stack = new ArrayList<Integer>(); // 1부터 n 수열
		int n = Integer.parseInt(br.readLine());
		int v = 1;
 
		for (int i = 0; i < n; i++) {
			sample.add(Integer.parseInt(br.readLine()));
		}
		while (true) {

			if (stack.size() > n) {
				System.out.println("NO");
				return;
			}
			if (sample.isEmpty()) {
				break;
			}
			if (stack.isEmpty()) {
				stack.add(v);
				sb.append('+').append("\n");
				v++;
			} else if (!(stack.isEmpty())) {
				if (stack.get(stack.size() - 1).equals(sample.get(0))) {
					stack.remove(stack.size() - 1);
					sample.remove(0);
					sb.append('-').append("\n");
				} else {
					sb.append('+').append("\n");
					stack.add(v);
					v++;
				}
			}
		}
		System.out.println(sb);
	}
}
