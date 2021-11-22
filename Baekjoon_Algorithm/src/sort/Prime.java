package sort;

import java.util.ArrayList;

public class Prime {
	
	// 소수 찾기 시간 계산
	
	public static ArrayList<Integer> list;
	public static ArrayList<Integer> list2;
	public static ArrayList<Integer> list3;
 
	public static void main(String[] args) {
 
		int N = 10000;
 
		for (int i = 0; i < 5; i++) {
			System.out.println("Prime Numbers less than or equal to " + N);
			
			list = new ArrayList<Integer>();	// list 초기화 
			make_prime(N);
			list.clear();						// 리스트 비우기
			
			list2 = new ArrayList<Integer>();	// list 초기화 
			make_prime2(N);
			list2.clear();						// 리스트 비우기
			
			list3 = new ArrayList<Integer>();	// list 초기화 
			make_prime3(N);
			list3.clear();						// 리스트 비우기
			
			System.out.println();
			if(i % 2 == 0) {
				N *= 5;
			}
			else {
				N *= 2;
			}
		}
 
	}
 
	// 방법 1 : N 이하의 모든 소수
	public static long make_prime(int number) {
 
		final long start = System.nanoTime();
		boolean TrueFalse; // true : 소수 , false : 비소수
		for (int i = 3; i <= number; i++) { // 2는 소수이므로 3 부터 시작
			// 0 과 1 은 소수가 아니므로 skip
 
			TrueFalse = true;
			for (int j = 2; j < number; j++) {
 
				// 소수가 아닐경우 종료
				if (i % j == 0) {
					TrueFalse = false;
					break;
				}
			}
			// 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
			if (TrueFalse)
				list.add(i);
		}
		final long end = System.nanoTime();
		System.out.println("run1 : " + (end - start) * 1e-9 + " sec");
		return end - start;
 
	}
 
	
	// 방법 2 : N 이하의 모든 소수
	public static long make_prime2(int number) {
		final long start = System.nanoTime();
		boolean TrueFalse; // true : 소수 , false : 비소수
		for (int i = 3; i <= number; i++) { // 2는 소수이므로 3 부터 시작
			// 0 과 1 은 소수가 아니므로 skip
 
			TrueFalse = true;
			for (int j = 2; j <= Math.sqrt(number); j++) {
 
				// 소수가 아닐경우 종료
				if (i % j == 0) {
					TrueFalse = false;
					break;
				}
			}
			// 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
			if (TrueFalse)
				list2.add(i);
		}
		final long end = System.nanoTime();
		System.out.println("run2 : " + (end - start) * 1e-9 + " sec");
		return end - start;
	}
 
	
	// 방법 3 : N 이하의 모든 소수
	public static long make_prime3(int number) {
		final long start = System.nanoTime();
 
		boolean[] check = new boolean[number + 1]; // true : 비소수 , false : 소수
		check[0] = check[1] = true;
 
		for (int i = 2; i <= Math.sqrt(number); i++) { //
			// 0 과 1 은 소수가 아니므로 skip
 
			if (check[i])
				continue; // 소수가 아닐경우 skip
 
			for (int j = i * i; j < check.length; j += i) {
				check[j] = true;
			}
		}
		for (int i = 0; i < check.length; i++) {
			if (!check[i]) list3.add(i);	// 소수(flase)인 경우 list3 에 추가
		}
		final long end = System.nanoTime();
		System.out.println("run3 : " + (end - start) * 1e-9 + " sec");
		return end - start;
	}
}