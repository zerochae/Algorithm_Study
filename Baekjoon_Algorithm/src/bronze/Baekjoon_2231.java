package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_2231 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int result = Integer.MAX_VALUE;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a; i++) {
			if (a == Sum(i)) {
				list.add(i);
			}
		}
 
		if (list.isEmpty()) {
			System.out.println(0);
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) < result) {
					result = list.get(i);
				}
			}
			System.out.println(result);
			scan.close();
		}
	}

	public static int Sum(int a) {
		int A = a;
		int result = 0;
		int sum = 0;
		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}
		result = sum + A;
		return result;
	}
}