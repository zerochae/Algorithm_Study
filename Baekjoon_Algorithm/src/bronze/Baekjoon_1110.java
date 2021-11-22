package bronze;
import java.util.Scanner;

public class Baekjoon_1110 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); 
		int res = n;
	 	int count = 1;
	 	while(true) {
			n = (((n%10)*10) + ((n/10 + n%10)%10));
			if(res == n) {
		 		break;
		 	} else {
		 		count++;
		 	}
	 	}  
	 	System.out.println(count);
 		scan.close();
	}
}
