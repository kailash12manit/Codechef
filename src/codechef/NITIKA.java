/**
 * 
 */
package codechef;

import java.util.Scanner;

/**
 * @author kailash.prajapati
 *
 */
public class NITIKA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t_case;
		Scanner sc= new Scanner(System.in);
		t_case=sc.nextInt();
		sc.nextLine(); 
		while(t_case-->0){
			String str=sc.nextLine();
			String []words=str.split("\\s");
			//System.out.println(words.length);
			if(words.length==1){
				System.out.println( str.toUpperCase().substring(0,1)+ str.toLowerCase().substring(1));		
			}
			else if(words.length==2)
   			     {
					String str1= words[0];
					String str2= words[1];
   			     	
					System.out.print( str1.toUpperCase().substring(0,1)+"."+" ");
					System.out.println( str2.toUpperCase().substring(0,1)+ str2.toLowerCase().substring(1) );
   			     }
			else {
					String str1= words[0];
					String str2= words[1];
					String str3= words[2];
					
					System.out.print( str1.toUpperCase().substring(0,1)+"."+" ");
					System.out.print( str2.toUpperCase().substring(0,1)+"."+" ");
					System.out.println( str3.toUpperCase().substring(0,1)+ str3.toLowerCase().substring(1) );
			}
								
		}	
	}
}
