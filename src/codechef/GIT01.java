package codechef;

import java.util.Scanner;

public class GIT01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int result[]= new int[t];
		while(t-->0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			sc.nextLine();
			char arr[][]= new char[n][m];
			for(int i=0;i<n;i++){
				String row=sc.nextLine();
				//System.out.println(row);
				char[]input =row.toCharArray();
				for(int j=0;j<m;j++){
					arr[i][j]=input[j];
				}			
			}
			
			int cost_red=0;
			int cost_green=0;
			char start_check='a';	
			for(int i=0;i<n;i++){                          	 	  //01
				if(i%2==0){
					start_check='G'; // even
				}
				else{
					start_check='R';  //odd
				}
				for(int j=0;j<m;j++){	
					
					if(arr[i][j]!=start_check){						
						if(start_check=='R'){
							cost_green+=3;  //G->R
							start_check='G';
							
						}
						else{
							cost_green+=5;  //R->G
							start_check='R';
							
						}
					}
					else{ if(start_check=='R'){
								start_check='G';
							}
							else{
								start_check='R';
							}
						}
				}//j
			}
			//System.out.println("cost green:"+cost_green);
						
			for(int i=0;i<n;i++){                  				   //02
				if(i%2==0){
					start_check='R'; // even
				}
				else{
					start_check='G';  //odd
				}
				for(int j=0;j<m;j++){	
					
					if(arr[i][j]!=start_check){
						if(start_check=='G'){
							cost_red+=5;  //R->G
							start_check='R';
							
						}
						else{
							cost_red+=3;  //G->R
							start_check='G';							
						}
					}
					else{
						if(start_check=='R'){
							start_check='G';
						}
						else{
							start_check='R';
						}
					}
				}
			}						
			//System.out.println("cost_RED"+cost_red);
			
			result[t]=Math.min(cost_red, cost_green);
		}//t
		for(int i=result.length-1;i>=0;i--){
			System.out.println(result[i]);
		}
	}
}