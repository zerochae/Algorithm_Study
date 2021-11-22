package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_10866 {

	static List<Integer> list = new ArrayList<Integer>();
	static List<Integer> list2 = new ArrayList<Integer>();
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = 0;
			String[] str = br.readLine().split(" ");
			if (str.length == 2) {
				num = Integer.parseInt(str[1]);
			}
			switch (str[0]) {
			case "push_back":
				push_back(num);
				break;
			case "push_front":
				push_front(num);
				break;
			case "pop_back":
				pop_back();
				break;
			case "pop_front":
				pop_front();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "front":
				front();
				break;
			case "back":
				back();
				break;
			}
		}
		int a = Integer.parseInt(sb.toString());
		System.out.println(a);
	}

	

	static public void push_back(int x) {
		list.add(x);
	}

	static public void push_front(int x) {

		for (int i = 0; i < list.size(); i++) {
			list2.add(list.get(0));
			list.remove(0);
		}

		list.add(x);

		for (int i = 0; i < list2.size(); i++) {
			list.add(list2.get(0));
			list2.remove(0);
		}
	}

	static public void pop_back() {
		if (list.isEmpty()) {
			sb.append(-1 );
		} else {
			sb.append(list.get(list.size() - 1) );
			list.remove(list.size() - 1);
		}
	}

	static public void pop_front() {
		if (list.isEmpty()) {
			sb.append(-1 );
		} else {
			sb.append(list.get(0) );			
			list.remove(0);
		}
	}

	static public void size() {
		sb.append(list.size() );
	}
	static public void empty() {

		if (list.isEmpty()) {
			sb.append(1 );
		} else {
			sb.append(0 );
		}
	}

	static public void front() {

		if (list.isEmpty()) {
			sb.append(-1 );
		} else {
			sb.append(list.get(0) );
		}
	}

	static public void back() {
		if (list.isEmpty()) {
			sb.append(-1 );
		} else {
			sb.append(list.get(list.size() - 1) );
		}
	}

}
