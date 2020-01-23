package IARCSJUD;

import java.util.Scanner;

public class BURARRAY {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=i+1;
			}
			int s=0;
			
			int QLine=sc.nextInt();
			while(QLine-->0) {
				int type=sc.nextInt();
				if(type==1) {
					int y=sc.nextInt();
					arr[y]=0;
					
				}
				else {
					//For each query of the second type, print a single line containing one integer ― the maximum of the given subsequence.
					int p=sc.nextInt();
					int q=sc.nextInt();
					
					
					
					
				}				
			}
		}
	}
}
