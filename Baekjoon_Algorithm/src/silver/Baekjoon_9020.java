package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_9020 {
	
	//시간 초과 15스택
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		boolean arr[] = new boolean[10001];
		
		arr[0] = arr[1] = true;
		
		for(int i = 2; i<=Math.sqrt(10000); i++) {
			
			if(arr[i]) continue;
			
			for(int j = i * i; j<arr.length; j += i) {
				arr[j] = true;
			}
		}

		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			
			int n = Integer.parseInt(br.readLine());
			
			int num1 = n/2;
			int num2 = n/2;
			
			loop : for(int i =num1; i>0; i--) {
				
				if(arr[i]) continue;
				
				for(int j = num2; j<n; j++) {
					
					if(arr[j]) continue;
					
					else if(i+j == n) {
							num1 = i;
							num2 = j;
							break loop;
					}
				}
			}
			sb.append(num1 +" " +num2 +"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close(); 
	}
}