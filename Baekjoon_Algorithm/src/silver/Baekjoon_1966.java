package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Baekjoon_1966 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);

			LinkedList<int[]> q = new LinkedList<int[]>();

			String input2[] = br.readLine().split(" ");
			for (int i = 0; i < n; i++) {
				q.offer(new int[] { i, Integer.parseInt(input2[i])});

			}

			int cnt = 0;

			while (!q.isEmpty()) {

				int[] front = q.poll();
				boolean isMax = true;

				for (int i = 0; i < q.size(); i++) {

					if (front[1] < q.get(i)[1]) {
						q.offer(front);
						for (int j = 0; j < i; j++) {
							q.offer(q.poll());
						}

						isMax = false;
						break;
					}
				}

				if (isMax == false) {
					continue;
				}

				cnt++;
				if (front[0] == m) {
					break;
				}
			}
			
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
	}
}
