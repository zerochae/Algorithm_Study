package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10866_2 {

	static int arr[] = new int[10000];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {

			String input[] = br.readLine().split(" ");
			int num = 0;
			if (input.length == 2) {
				num = Integer.parseInt(input[1]);
			}

			switch (input[0]) {
			case "push_front":
				push_front(num);
				break;
			case "push_back":
				push_back(num);
				break;
			case "pop_front":
				pop_front();
				break;
			case "pop_back":
				pop_back();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "front":
				front();
				break;
			case "back":
				back();
				break;
			}
		}
	}

	public static int index() {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				index++;
			} else {
				break;
			}
		}
		return index;
	}

	public static void push_front(int x) {

		if (index() != 0) {
			for (int i = index() + 1; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
		}
		arr[0] = x;
	}

	public static void push_back(int x) {
		arr[index()] = x;
	}

	public static void pop_front() {

		if (index() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(arr[0]);
			for (int i = 1; i <= index(); i++) {
				arr[i - 1] = arr[i];
			}
		}

	}

	public static void pop_back() {
		if (index() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(arr[index() - 1]);
			arr[index() - 1] = 0;
		}
	}

	public static void size() {
		System.out.println(index());
	}

	public static void empty() {
		if (index() == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static void front() {
		if (index() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(arr[0]);
		}
	}

	public static void back() {
		if (index() == 0) {
			System.out.println(-1);
		} else {
			System.out.println(arr[index() - 1]);
		}
	}
}
