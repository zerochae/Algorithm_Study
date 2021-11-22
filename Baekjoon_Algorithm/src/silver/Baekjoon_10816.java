package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon_10816 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		
		String str[] = br.readLine().split(" ");
		for(int i =0; i<n; i++) {
			int num = Integer.parseInt(str[i]);
			hashMap.putIfAbsent(num, 0);
			hashMap.replace(num,hashMap.get(num)+1);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		String str2[] = br.readLine().split(" ");
		for(int i =0; i<m; i++) {
		int num = Integer.parseInt(str2[i]);
		if(!hashMap.containsKey(num)) {
			sb.append("0").append(" ");
		} else {
			sb.append(hashMap.get(num)).append(" ");
		}
		
		}
		System.out.print(sb);
	}
}
