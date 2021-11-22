package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_1011 {
	
	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		

		int t = Integer.parseInt(br.readLine());

		for(int i =0; i<t; i++) {

			String input[] = br.readLine().split(" ");

			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]) - 2;
			int cnt = 2;
			int k = 1;
			boolean flag = false;

			while (x != y) {
				

				if (!flag && y - x > k) {
					flag = true;
					x += k + 1;
				} else if (y - x < k) {
					x += k - 1;
				} else if(flag){
					flag = false;
					x += k;
				}
				cnt++;
				k += 1;
			}
			sb.append(cnt+"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
