package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Baekjoon_18870 {


	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int cnt = 0;
		String input[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		int temp[] = new int[n];
		
		for(int i =0; i<n; i++) {
			temp[i] = arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i =0; i< arr.length; i++) {
			if(!(map.containsKey(arr[i]))) {
				map.put(arr[i], cnt++);
			}
		}
		
		for(int i =0; i< n; i++) {
			sb.append(map.get(temp[i])).append(" ");
		}

		System.out.print(sb.toString());
	}
}