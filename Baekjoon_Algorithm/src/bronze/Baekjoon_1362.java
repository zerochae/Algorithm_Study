package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1362 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sean = 0;
		String happy = ":-)";
		String sad = ":-(";
		String death = "RIP";
		
		main: while (true) {
			String input[] = br.readLine().split(" ");
			String result = "";
			if (input[0].equals("0") && input[1].equals("0")) {
				break main;
			} else {
				
				sean++;

				double o = Integer.parseInt(input[0]); // 적정 체중
				double w = Integer.parseInt(input[1]); // 실제 체중
				
				loop: while (true) {
					
					if(!result.equals(death)) {
						
						if(w <= 0) result = death;
						else if(w > o * 0.5 && w < 2.0 * o) result = happy;
						else result = sad;
						
					}
					
					String menu[] = br.readLine().split(" ");
					String m = menu[0];
					int num = Integer.parseInt(menu[1]);
					
					if (m.equals("#")) {
						break loop;
					} else {
						switch (m) {
						case "F": w += num;
							break;
						case "E": w -= num;
							break;
						}
					} 
				}
			}
			System.out.println(sean +" "+result);
		}
	}
}