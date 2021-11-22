package bronze;

import java.util.Scanner;

public class Baekjoon_2839 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 설탕의 무게
		
		int min = 5000;
		
		
		for(int i =0; i<5000; i++) {
			for(int j =0; j<5000; j++) {
				if(n == 3*i + 5*j) {
					if(min > i+j) {
						min = i+j;
					}
				}
			}
		}
		if(min == 5000) {
			System.out.println("-1");
		} else {
			System.out.println(min);
		}
		
	}
}
