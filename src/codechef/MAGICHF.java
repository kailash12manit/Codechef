package codechef;

import java.util.Scanner;

public class MAGICHF {
	public static void main(String[] args) {
		int t, n,x ,s;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0) {
			
			n=sc.nextInt();  //  N  boxes : 1 to N
			x=sc.nextInt();  // Xth place where GOLD placed
			s=sc.nextInt(); // s time swap
			int coinbox=x;
			
			for(int i=0;i<s;i++) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a==coinbox) {
					coinbox=b;
				}
				else if(b==coinbox) {
					coinbox=a;
				}
			}				
			System.out.println(coinbox);			
		}		
	}
}
