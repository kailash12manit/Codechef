package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class ZOMCAV {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			int n=sc.nextInt();
			long h[]= new long[n];
			long c[]= new long[n];

			for(int i=0;i<n;i++) {
				c[i]=sc.nextLong();
			}
			for(int i=0;i<n;i++) {
				h[i]=sc.nextLong();
			}

			long[] r = new long[n];
			Arrays.fill(r,0);

			for(int i=0;i<n;i++) {
				long lo =(i+1)-c[i]-1;
				long hi = (i+1)+c[i]-1;
				if(lo<=0){
					lo=0;
				}
				if(hi>=n){
					hi=n-1;
				}
				update(r,n,lo,hi,1);
			}
			getArr(r,n);

			Arrays.sort(r);
			Arrays.sort(h);

			boolean flag=true;
			for(int i=0;i<n;i++) {
				if(r[i]!=h[i]) {
					flag=false;
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

	public static void update(long[] arr, int n,long lo,long hi,long val){
		int low = (int)lo;
		int high = (int)hi;
		
		arr[low] += val;

		if(hi!=n-1){
			arr[high+1]-=val;
		}
	}

	public static void getArr(long[] arr,int n) {
		for(int i=1;i<=n-1;i++) {
			arr[i] +=arr[i-1];
		}
	}
}