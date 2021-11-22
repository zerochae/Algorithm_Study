package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon_17219 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		while(n --> 0) {
			String value[] = br.readLine().split(" ");
			map.put(value[0], value[1]);
		}
		
		while(m --> 0) {
			String url = br.readLine();
			sb.append(map.get(url)).append('\n');
		}
		System.out.println(sb);
	}
}
