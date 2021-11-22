package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon_11723 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		
		int m = Integer.parseInt(br.readLine());
		
		while(m --> 0) {
			
			String input[] = br.readLine().split(" ");
			int num = 0;
			if(input.length == 2) {
				num = Integer.parseInt(input[1]);
			}
			switch (input[0]) {
			case "add": 
				set.add(num);
				break;
			case "check" :
				if(set.contains(num)) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			case "remove" :
				if(set.contains(num)) {
					set.remove(set.indexOf(num));
				} else {
					continue;
				}
				break;
			case "toggle" :
				if(set.contains(num)) {
					set.remove(set.indexOf(num));
				} else {
					set.add(num);
				}
				break;
			case "all" :
				set.clear();
				for(int i =1; i<21; i++) {
					set.add(i);
				}
				break;
			case "empty" :
				set.clear();
			}
		}
		System.out.println(sb);
	}
}