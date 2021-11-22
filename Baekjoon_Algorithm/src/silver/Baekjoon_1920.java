package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_1920 {
	
	public static int[] arr;
	
	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i =0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i =0; i<m; i++) {
			int num  = binarySearch(Integer.parseInt(st.nextToken()));
			if(num>=0) {
				sb.append(1).append('\n');
			} else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
	}
		
	
	public static int binarySearch(int key) {
		int lo = 0;
		int hi = arr.length-1;
		while(lo <= hi) {
			
			int mid = (lo + hi) / 2;
			
			// key값이 mid보다 작은경우
			if(key < arr[mid]) {
			hi = mid-1;
			// key값이 mid보다 큰경우
			} else if (key > arr[mid]) {
			lo = mid +1;
			}
			// 같은 경우
			else {
				return mid;
			}
		}
		return -1;
	}
	
}
