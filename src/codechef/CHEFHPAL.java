package codechef;

import java.util.Scanner;

public class CHEFHPAL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int a=sc.nextInt();
			if(a==26){
				System.out.print("1 ");
				char c = 'a';

				for(int i=1;i<n;i++){
					System.out.print(c);
					c++;
					if(c=='z'){
						i++;
						System.out.print(c);
						c='a';
					}					
				}
				System.out.println();
			}
			
		}
	}
}
