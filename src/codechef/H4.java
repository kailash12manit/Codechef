package codechef;

import java.util.Scanner;

public class H4 {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			int m=sc.nextInt();
			double sum=0;
			for(int i=1;i<=n;i++) {
				sum=(sum+( Math.pow(i,i)%m)%m);
			}
			System.out.println((long)sum);			
		}
	}
}