package codechef;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class CSUBQ {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		Arrays.fill(arr,0);
		
		int q=sc.nextInt();
		int l=sc.nextInt();//atleast
		int r=sc.nextInt();//atmost
		while(q-->0){
			int a=sc.nextInt();
			if(a==1){
				int b=sc.nextInt()-1;
				int c=sc.nextInt();
				arr[b]=c;
								
			}else{
				int count=0;
				int b=sc.nextInt()-1; 
				int c=sc.nextInt()-1;
				/*
				for(int hh:arr){
					System.out.print(hh+" ");
				}
				System.out.println();
				*/
				for(int i=b;i<=c;i++){
					int flag=0;
				    for(int j=i;j<=c;j++){
				    	
						if(arr[j]>=l && arr[j] <=r){
							flag=1;
							count++;
							//System.out.println(" count i: "+i+" j: "+j+" count "+count);
							
						}else if(arr[j]<l && flag==1){
							    count++;
								//System.out.println(" continue i: "+i+" j: "+j+" count "+count);
								continue;
						}else if(arr[j]<l){
							//System.out.println(" continue i: "+i+" j: "+j+" count "+count);
							continue;
						}
						else if(arr[j]>r){
							//System.out.println(" break i: "+i+" j: "+j+" count "+count);
							break;
						}
				    }//for j
				}//for i
				System.out.println(count);
			}
		}
	}
} 