package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2108 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[8001];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;
		int mode = 10000;
		
		for(int i =0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
			arr[num + 4000]++;
			
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		
		int cnt = 0;
		int mode_max = 0;
		
		boolean flag = false;
		
		for(int i = min+4000; i <= max + 4000; i++) {
			
			if(arr[i] > 0) {
				
				if(cnt < (n+1)/2) {
					cnt += arr[i];
					median = i - 4000;
				}
				
				if(mode_max < arr[i]) {
					
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;
				}
				
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
		
		System.out.println((int)Math.round((double)sum / n));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max - min);
		
	}
}
