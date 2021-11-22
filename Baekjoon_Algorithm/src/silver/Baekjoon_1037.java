package silver;

import java.util.Scanner;

public class Baekjoon_1037 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt(); // 약수의 개수
			
			int arr[] = new int[n];
			
			int multi = 1;
			for(int i=0; i<n; i++) {
				arr[i] = scan.nextInt();
				 
			}
			for(int i=0; i<n; i++) {
				for(int j=i; j<n; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			for(int i =0; i<n; i++) {
				multi = arr[i] * arr[(n-1)-i];
			}
			System.out.println(multi);
			scan.close();

		}

	}


