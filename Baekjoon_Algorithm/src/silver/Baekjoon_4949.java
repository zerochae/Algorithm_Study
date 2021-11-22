package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Baekjoon_4949 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String input = br.readLine();
			if (input.equals(".")) {
				break;
			}
			System.out.println(solve(input));
		}
	}

	public static String solve(String s) {

		LinkedList<Character> stack = new LinkedList<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			switch (c) {
			case '(':
				stack.push(c);
				break;
			case ')':
				if (stack.isEmpty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
					break;
				}
			case '[':
				stack.push(c);
				break;
			case ']':
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
					break;
				}
			}
		}
		if (stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
