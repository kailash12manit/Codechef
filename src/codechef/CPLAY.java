package codechef;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CPLAY  {
	public static void main(String[] args) throws IOException {
		Scanner br = new Scanner(new BufferedInputStream(System.in));
		 
		String arr= null;		
		while(br.hasNextLine()){
			arr=br.nextLine();
			//System.out.println(arr);
			char[]brr= arr.toCharArray();
			int chef_count=0;
			int opponent_count=0;		
			
			for(int i=0;i<20;i++){
				if(i%2==0 && brr[i]==1){
					opponent_count++;
				}
				else if(i%2!=0 && brr[i]==1){
					chef_count++;
				}
				
			}			
		}	
	}	
}