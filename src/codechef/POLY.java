package codechef;
import java.util.*;

public class POLY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int n= sc.nextInt();
			int arr[][]= new int[n][4];
			for(int i=0;i<n;i++){
				for(int j=0;j<4;j++){
					arr[i][j]=sc.nextInt();
				}				
			}					
			int q=sc.nextInt();
			long res[]=new long[q];
			while(q>0){
				//System.out.println(q);
				long min=Long.MAX_VALUE;
				long tt=sc.nextLong();
				long tt1=(tt*tt);
				long tt2=tt1*tt;
								
				for(int i=0;i<n;i++){
					if(arr[i][2]==0 && arr[i][3]==0){
						long temp=((long)arr[i][0]+ (long)arr[i][1]*tt);
						if(temp<min){
							min=temp;
						}
					}
					else{
						long temp= ((long)arr[i][0]+ (long)arr[i][1]*tt+ (long)arr[i][2]*tt1 + (long)arr[i][3]*tt2);
						if(temp<min){
							min=temp;
						}
					}
				}			
				res[q-1]=min;
				q--;
			}
			for(int temp=res.length-1;temp>=0;temp--){
				System.out.println(res[temp]);
			}
			t--;
		}
	}
}