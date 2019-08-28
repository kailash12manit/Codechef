package codechef;

import java.util.Scanner;

public class CHEFDIL {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String str=sc.nextLine();
			int len=str.length();
			int count=0;
			for(int i=0;i<len;i++) {
				if(str.charAt(i)=='1') {
					count++;
				}
			}
			
			if(count%2==0) {
				System.out.println("LOSE");
			}
			else {
				System.out.println("WIN");
			}			
		}//t		
	}
}
