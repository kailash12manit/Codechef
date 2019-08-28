package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class DSTAPLS {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			long k=sc.nextLong();
			long arr[]=new long[(int)k];
			long brr[]=new long[(int)k];
			Arrays.fill(arr,n/k);
			/*
			for(int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
			*/
			long nn=n;
			while(nn>0) {
				brr[0]=brr[0]+k;
				Arrays.sort(brr);
				nn-=k;
			}
			/*
			for(int i:brr) {
				System.out.print(i+" ");
			}
			System.out.println();
			*/
			boolean flag=false;
			for(int i=0;i<k;i++) {
				if(arr[i]!=brr[i]) {
					flag=true;
					break;
				}
			}
			
			if(flag==true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}