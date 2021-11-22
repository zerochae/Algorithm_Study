package silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_2164 {
	//#2164
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
			Queue<Integer> queue = new LinkedList<Integer>();
			
			for(int i =1; i<=n; i++) {
				queue.add(i);
			}
			 
			while(queue.size() != 1) {
				queue.remove();
				queue.add(queue.remove());
			}
			
			System.out.println(queue.remove());
			scan.close();
	}
}