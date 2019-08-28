/**
 * 
 */
package codechef;
 
import java.util.Scanner;
 
/**
 * @author kailash.prajapati
 *
 */
class BONDFOND {
	/**
	 * @param args
	 * FOND has to find the minimum absolute difference between N and any number A which is a power of 2. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb= new Scanner(System.in);
		int T= kb.nextInt();
		while(T-->0){
			
			long N= kb.nextLong();
			long min_ab_dif=Integer.MAX_VALUE;
			long A=1;
			int count=0;
			long p = 0;
			while(A <=N){
				 p=A;
				 A=A*2;
				 count++;
				
			}
			System.out.println(Math.min(A-N, N-p));
			
			
			
		}
 
	}
} 