package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Baekjoon_11866 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++) {
			list.offer(i);
		}
		sb.append("<");
		while (list.size() > 1) {
			for (int i = 0; i < k - 1; i++) {
				int num = list.poll();
				list.offer(num);
			}
			sb.append(list.poll()).append(", ");
		}
		sb.append(list.poll());
		sb.append(">");
		System.out.println(sb);
	}
}
