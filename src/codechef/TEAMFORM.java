/**
 * 
 */
package codechef;

import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class TEAMFORM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int N=sc.nextInt();
			int M=sc.nextInt();
			for(int i=0;i<M;i++){
				int temp1=sc.nextInt();
				int temp2=sc.nextInt();
			}
			if((N-(2*M))%2==0){
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
