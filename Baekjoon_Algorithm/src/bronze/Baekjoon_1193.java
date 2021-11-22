package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1193 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int n = 0;
		while(true) {
			n++;
			sum +=n;
			if(sum>=x) {
				if(n%2==0) {
					System.out.println((x-sum+n)+"/"+(sum-x+1));
				} else {
					System.out.println((sum-x+1)+"/"+(x-sum+n));
				}
				break;
			}
		}
		br.close();
	}
}
