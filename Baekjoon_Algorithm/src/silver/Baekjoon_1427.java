package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1427 {
	
	// RunTime Error : ArrayIndexOutofBounds 2 , 오답 2
	// 배열 선언시 최대 크기에 주의
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		
		String input[] = br.readLine().split(""); 
		int arr[] = new int[10];
		
		for(int i =0; i<input.length; i++) {
			
			int index = Integer.parseInt(input[i]);
			
			arr[index]++;
			
		}
		
		for(int i = arr.length-1; i>=0; i--) {
			
			if(arr[i] != 0) {
				while(arr[i] --> 0) {
					sb.append(i);
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
