package codechef;

import java.util.Scanner;

public class COKE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t_case=sc.nextInt();
		while(t_case-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			int l=sc.nextInt();
			int r=sc.nextInt();
			int min_price=-1;
		
			//			if t>K+1, then one minute later, its temperature will be t−1
			//			if t<K−1, then one minute later, its temperature will be t+1
			//			if K−1≤t≤K+1, then one minute later, its temperature will be K 

			for(int i=0;i<n;i++) {				
				int t=sc.nextInt();
		        int p=sc.nextInt();
				
		        if(t<=k){
		            if(t+m>=k) {
		            	t=k;
		            }
		            else {
		            	t=t+m;
		            }
		        }
		        else{
		            if(t-m<=k) {
		            	t=k;
		            }
		            else {
		            	t=t-m;
		            }
		        }
		        if(l<=t&&t<=r){
		           if(min_price==-1) {
		        	   min_price=p;
		           }
		           else {
		        	   min_price=Math.min(min_price,p);
		           }
		        }
			}
			System.out.println(min_price);
		}
	}
}
