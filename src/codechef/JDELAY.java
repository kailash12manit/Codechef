package codechef;

import java.util.Scanner;

public class JDELAY {
	public static void main(String[] args) {
		int T ,N, Si,Ji;
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		while(T-->0) {
			N=sc.nextInt();
			int count=0;
			for(int i=0;i<N;i++) {
				Si=sc.nextInt();
				Ji=sc.nextInt();
				if(Ji-Si>5) {
					count++;
				}
				
			}
			System.out.println(count);
						
		}		
	}
}