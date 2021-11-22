package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon_1181 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String voca[] = new String[n];
		for (int i = 0; i < n; i++) {
			voca[i] = br.readLine();
		}
		
		Arrays.sort(voca, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}			
		});
		
		for (int i = 1; i < n; i++) {
			if(voca[i-1].equals(voca[i])) {
				continue;
			} else {
				System.out.println(voca[i-1]);
			}
		}
		System.out.println(voca[n-1]);
	}
}
