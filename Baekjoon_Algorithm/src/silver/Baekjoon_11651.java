package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_11651 {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[n][2];
		
		for(int i =0; i<n; i++) {
			String str[] = br.readLine().split(" ");
			
			arr[i][1] = Integer.parseInt(str[0]);
			arr[i][0] = Integer.parseInt(str[1]);
		}
		
		Arrays.sort(arr,(arr1,arr2)->{
			if(arr1[0] == arr2[0]) {
				return arr1[1] - arr2[1]; 
			} else {				
				return arr1[0] - arr2[0];
			}
		});

	for(

	int i = 0;i<n;i++)
	{
		System.out.println(arr[i][1] + " " + arr[i][0]);
	}
}

}
