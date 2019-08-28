package codechef;
import java.util.*;

//https://www.codechef.com/viewsolution/15881561
 
public class SHTARR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			
			int n= sc.nextInt();
			int q= sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			while(q-->0){
				/*
				for(int tr:arr){
					System.out.print(tr+" ");
				}
				System.out.println();
				*/
				char c= sc.next().charAt(0);
				if(c=='?'){  // ? 4 3 9
					
					int i=sc.nextInt(); // 4
					int l=sc.nextInt(); // 3
					int r=sc.nextInt(); // 9
					
					int count=0;
					int rays=r-l+1;  // for jth rays :  (i - 0.5, L+ j - 1.5)
					int j=1;
					boolean []visited=new boolean[n];
					while(j<=rays){
						int x_cor=i-1;
						double y_cor=l+j-1.5;
						for(int right=x_cor;right<n;right++){
							
							if(y_cor <= (double) arr[right]){
								if(visited[right]==false){
									count++;
									visited[right]=true;
									//System.out.println("y_cor: "+y_cor+" arr[right]: "+(double) arr[right]+" count "+count);
								}
								break;
							}						
						}
						j++;
					}
					System.out.println(count);
				}
				else{
					int i=sc.nextInt()-1;
					int x=sc.nextInt();
					int temp=arr[i];
					arr[i]=temp+x;					
				}
			}			
		}
	}
}