package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_15881 {
	
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char arr[] = new char[n];
		
		String input = br.readLine();
		
		for(int i =0; i<n; i++) {
			arr[i] = input.charAt(i);
		}
		
		int cnt = 0;
		for(int i =0; i< arr.length; i++) {
			if(i < arr.length -3)
			if(arr[i] == 'p') {
				if(arr[i+1] == 'P') {
					if(arr[i+2] == 'A') {
						if(arr[i+3] == 'p') {
							cnt++;
							i += 3;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
