package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_10845 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> stack = new ArrayList<Integer>();
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
 
			String str[] = br.readLine().split(" ");

			switch (str[0]) {
			case "push":
				int a = Integer.parseInt(str[1]);
				stack.add(a);
				break;
			case "pop":
				try {
					System.out.println(stack.get(stack.size()-1));
					stack.remove(stack.size()-1);
				} catch (Exception e) {
					System.out.println(-1);
				}
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if (stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top":
				try {
					System.out.println(stack.get(stack.size()-1));
				} catch (Exception e) {
					System.out.println(-1);
				}
			}
		}
	}
}
