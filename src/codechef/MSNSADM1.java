package codechef;

import java.util.Scanner;

public class MSNSADM1 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]= new int[n];
			int brr[]= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt()*20;
			}
			for(int i=0;i<n;i++) {
				brr[i]=sc.nextInt()*10;
			}
			
			int total=0;
			for(int i=0;i<n;i++) {
				total=Math.max(total,arr[i]-brr[i]);
			}	
			System.out.println(total);
		}
	}
}
