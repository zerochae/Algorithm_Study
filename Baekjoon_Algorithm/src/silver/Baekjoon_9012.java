package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Baekjoon_9012 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		while(n --> 0) {
			
			sb.append(solve(br.readLine())).append("\n");
		}			
		System.out.println(sb);
	}
	
	public static String solve(String s) {
		
		LinkedList<Character> stack = new LinkedList<Character>();
		
		for(int i =0; i<s.length(); i++) {
			
			char c = s.charAt(i);
			
			if( c == '(') {
				stack.push(c);
			} else if(stack.isEmpty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
