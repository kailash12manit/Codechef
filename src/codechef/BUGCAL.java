package codechef;
import java.util.*;

//https://www.codechef.com/LTIME53/problems/BUGCAL

public class BUGCAL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result=0;
			int multiply=1;
			
			while(a>0 && b>0){
				int temp=( (a%10)+(b%10) )%10;
				result+=multiply*temp;
				multiply*=10;
				a=a/10;
				b=b/10;
			}
			if(a>0){
				while(a>0){
					result+=multiply*(a%10);
					a/=10;
					multiply*=10;
				}
			}
			if(b>0){
				while(b>0){
					result+=multiply*(b%10);
					b/=10;
					multiply*=10;
				}
				
			}
			System.out.println(result);				
		}		
	}

}
