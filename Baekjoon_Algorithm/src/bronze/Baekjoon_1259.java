package bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Baekjoon_1259 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		while(true) {
		
		String str[] = br.readLine().split("");
		
		int arr[] = new int[str.length];
		int arr2[] = new int[str.length];
		
		String result ="";
		for(int i =0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		for(int i=arr.length-1; i>=0; i-- ) {
			arr2[i] = Integer.parseInt(str[arr.length-i-1]);
		}
		
		if(arr[0] == 0 && arr.length == 1) {
			break;
			}
		for(int i =0; i<arr.length; i++) {
			if(arr[i] != arr2[i] || arr[0] == 0) {
				result = "no";
				break;
			} else {
				result = "yes";
				}
			}
		System.out.println(result);
		}
	}
}
