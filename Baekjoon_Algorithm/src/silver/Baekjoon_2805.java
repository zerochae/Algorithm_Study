package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_2805 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]); //나무의 수
		int m = Integer.parseInt(input[1]); // 나무의 길이
		
		int arr[] = new int[n];
		
		String input2[] = br.readLine().split(" ");
		for(int i =0; i<n; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}
		
		Arrays.sort(arr);
		
		long high = arr[n-1];
		long low = 0;
		
		while(high >= low) {
			
			long cnt = 0;
			
			long mid = (high + low) /2;
			
			for(int i =0; i<arr.length; i++) {
				
				if(arr[i] - mid > 0) {
					cnt += arr[i]-mid;
				} 
			}
			
			if(cnt >= m) low = mid+1;
			else if(cnt < m) high = mid-1; 
		}
		System.out.println(high);
	}
}
