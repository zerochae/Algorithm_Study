package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15652 {
	
	static int n;
	static int m;
	static int arr[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input[] = br.readLine().split(" ");

		n = Integer.parseInt(input[0]); // 1 ~ n 까지의 수를
		m = Integer.parseInt(input[1]); // 길이가 m인 수열을 구하라

		arr = new int[m]; // 수열을 담을 길이가 m인 배열 선언

		dfs(1, 0); // 탐색 시작

		System.out.println(sb.toString());

	}

	private static void dfs(int node ,int depth) {

		if (depth == m) { // 깊이가 배열의 길이와 같아지면
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" "); // 배열의 원소를 StringBuiler에 담아라
			}
			sb.append("\n"); // 다 담았으면 줄바꿔라

			return; // -> 여기로 돌아가는곳은 47번째줄임 - dfs(depth+1);
		}

		for (int i = node; i <= n; i++) {

				arr[depth] = i; // i(1~n)를 담아
				dfs(i , depth + 1); // 다음 깊이로 가서 또 담아 -> 만약 depth+1 == m이라서 if에서 걸려서 출력을 해주면 여기로 다시 돌아온텐데
		}
	}
}
