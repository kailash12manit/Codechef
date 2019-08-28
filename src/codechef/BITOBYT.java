package codechef;

import java.util.Scanner;

public class BITOBYT {
	public static void main(String[] args) {
		int n,t;
		Scanner sc = new Scanner(System.in);
		t= sc.nextInt();
		while(t-->0) {
			n=sc.nextInt()-1;
			int x=n%26;
			long p;
			p=(long)Math.pow(2,n/26);
			if(x<2) {
				System.out.println(p+" 0 "+"0");
			}
			else if(x<10){
				System.out.println("0 "+p+" 0");
			}
			else if(x<26) {
				System.out.println("0 "+"0 "+p);
			}		
		}	
	}
}