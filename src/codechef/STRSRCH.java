package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class STRSRCH {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int []arr = new int[26];
		Arrays.fill(arr,0);
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			arr[ch-'a']++;			
		}
		int count=0;
		for(int j:arr) {
			if(j>0 && j%2!=0) {
				count++;
			}
		}
		System.out.println(count/2);
	}
}