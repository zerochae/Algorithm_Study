package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_1654 {
 
	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input[] = br.readLine().split(" ");
		
		int k = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		
		int arr[] = new int[k];
		
		for(int i =0; i<k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		long high = arr[k-1];
		long low = 1;
		while(high >= low) {
			
			long cnt = 0;
			long mid = (high+low) /2 ;
			
			for(int i =0; i<arr.length; i++) {
				cnt += arr[i]/mid;
			}
			
			if(cnt >= n) low = mid+1;
			else if(cnt < n) high = mid-1;
		}
		System.out.println(high);
	}
}
