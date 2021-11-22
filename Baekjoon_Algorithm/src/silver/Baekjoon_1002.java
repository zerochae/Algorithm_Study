package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_1002 {
	
	/*
	 
	    1. 접점의 개수가 무한 -> -1
	    2. 접점이 없을 때 
	 	2-1.두 점 사이의 거리가 각 원의 반지름의 합보다 클 때 -> 0
 	   	2-2. 한 원 안에 다른 원에 있을 때 -> 0
	  	3. 접점이 한개 
		3-1 내접 -> 1
		3-2 외접 -> 1
		4.그 외의 경우 접점 2개
		
	 */
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t -->0) {
			
			String input[] = br.readLine().split(" ");
			
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int r1 = Integer.parseInt(input[2]);
			int x2 = Integer.parseInt(input[3]);
			int y2 = Integer.parseInt(input[4]);
			int r2 = Integer.parseInt(input[5]);
			
			int x = ((x2-x1) * (x2-x1));
			int y = ((y2-y1) * (y2-y1));
			int rA = ((r1+r2) * (r1+r2)); 
			int rB = ((r2-r1) * (r2-r1)); 
			
			if(x1 == x2 && y1 == y2 && r1 == r2) sb.append(-1 + "\n");
			else if (x + y > rA) sb.append(0 + "\n");
			else if(x + y < rB) sb.append(0 + "\n");
			else if(x + y == rB) sb.append(1 + "\n");
			else if(x + y == rA) sb.append(1 + "\n");
			else sb.append(2+"\n");
		}
		System.out.println(sb.toString());
	}
}
