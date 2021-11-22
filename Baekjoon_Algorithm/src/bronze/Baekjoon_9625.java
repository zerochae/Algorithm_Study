package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9625 {
	
	static Integer dpA[];
	static Integer dpB[];
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		
		dpA = new Integer [50];
		dpB = new Integer [50];
		
		System.out.println(solveA(k) +" "+solveB(k));
	}

	static int solveA(int n) {
		dpA[0] = 1;
		if(n == 1) return dpA[1] = 0;
		if(n == 2) return dpA[2] = 1;
		
		if(dpA[n] == null) {
			dpA[n] = solveA(n-1) + solveA(n-2);
		}
		
		return dpA[n];
	}
	
	static int solveB(int n) {
		dpA[0] = 0;
		if(n == 1) return dpB[1] = 1;
		if(n == 2) return dpB[2] = 1;
		
		if(dpB[n] == null) {
			dpB[n] = solveB(n-1) + solveB(n-2);
		} 
		
		return dpB[n];
	}
}
