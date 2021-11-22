package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1094 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i =0; i<7; i++) {
			if((x&(1<<i)) > 0) cnt++;
		}
		System.out.println(cnt);
	}
}
