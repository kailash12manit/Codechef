/**
 * 
 */
package codechef;

import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class CHEFSIGN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t_case;
		Scanner sc= new Scanner(System.in);
		t_case=sc.nextInt();
		while(t_case-->0){
			String str= sc.next();
			char []arr= str.toCharArray();
			int count=1;
			for(int i=1;i< str.length();i++){
				if(arr[i]=='<' && arr[i-1]=='<'){
					count++;
				}
				
			}			
			for(int i=0;i< str.length();i++){
				
				if(arr[i]=='<'){
					count++;
				}
				else if(arr[i]=='>'){
					count--;
				}
				else {
					continue;
				}
			}
			System.out.println(count);
		}
	}
}