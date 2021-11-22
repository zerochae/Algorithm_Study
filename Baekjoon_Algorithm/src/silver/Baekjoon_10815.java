package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_10815 {

	static int arr[];

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		arr = new int[n];
		String input[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}

		int m = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		String input2[] = br.readLine().split(" ");
		for (int i = 0; i < m; i++) {
			
			int low = 0;
			int high = n-1;
			int num = Integer.parseInt(input2[i]);
			while(low <= high) {
				int mid = arr[(low + high)/2];
				if(num == mid) sb.append(1 + " ");
				else if(num > mid) low = mid +1;
				else high = mid - 1;
				if(low >  high) {
					sb.append(0 + " ");
					break;
				}
			}
		}
		System.out.println(sb);
	}

	public static boolean solution(int x) {

		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = arr[(low + high) / 2];
			if (x == mid) return true;
			else if (x > mid)
				low = mid + 1;
			else if (x < mid)
				high = mid - 1;
		}
		return false;
	}
}
