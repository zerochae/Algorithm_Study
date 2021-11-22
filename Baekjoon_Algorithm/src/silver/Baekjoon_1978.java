package silver;

import java.util.Scanner;

public class Baekjoon_1978 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int prime[] = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			prime[i] = scan.nextInt();

			if (prime[i] == 1) {
				cnt++;
			}

			for (int j = 2; j <= Math.sqrt(prime[i]); j++) {

				if (prime[i] % j == 0) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(n - cnt);
		scan.close();
	}
}
