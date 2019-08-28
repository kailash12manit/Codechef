package codechef;

import java.util.Scanner;

public class MMAX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String n=sc.nextLine();   // no of person
			String k=sc.nextLine();   // no of chocolate 
			int nn =Integer.parseInt(n);
			int kk = Integer.parseInt(k);
			int arr[]= new int[nn];
			int temp=kk;
			int i=0;
			while(temp-->0) {
				arr[i]=arr[i]+1;
				i++;
				if(i>nn-1) {
					i=0;
				}
			}
			
			for(int kp:arr) {
				System.out.print(kp+" ");
			}
			System.out.println();
			
			int brr[]= new int[nn];
			int j=0;
			for(int tmp=0;tmp<=arr.length/2 ;tmp++) {
				brr[j]=arr[tmp];
				j++;
				if(j==nn) {
					break;
				}
				brr[j]=arr[nn-tmp-1];
				j++;
				if(j==nn) {
					break;
				}
			}
			
			
			System.out.println("brr");
			for(int kp:brr) {
				System.out.print(kp+" ");
				
			}
			System.out.println();
			
			
			long sum=0;
			for(int tmp=1;tmp<nn;tmp++) {
				sum=sum+ Math.abs(brr[tmp]-brr[tmp-1]);
			}
			System.out.println(sum);
		}		
	}
}
