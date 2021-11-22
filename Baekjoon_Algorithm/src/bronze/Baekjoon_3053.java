package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_3053 {
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		double pi = Math.PI;
		/*
		 	
		 	택시 기하학
		 	
		 	t1(x1,y1) , t2(x2,y2) 사이의 거리
		 	
		 	D(t1,t2) = |x1-x2| + |y1-y2|
		 	
		 	유클리드 기하학
		 
		 */
		double taxi = ((r+r)*(r+r))/2;
		double euclid = pi * Math.pow(r, 2);
		
		System.out.println(String.format("%.6f", euclid));
		System.out.println(String.format("%.6f", taxi));
	}
}
