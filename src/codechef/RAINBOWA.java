package codechef;

import java.util.Scanner;

public class RAINBOWA {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase= sc.nextInt();
		
		while(tcase-->0){
			
			int N=sc.nextInt();
			int arr[] = new int[N];
			int flag=1;
			for(int i=0;i<N;i++){
				arr[i]=sc.nextInt();
			}
			if(flag==1){
				int middle=N/2;
				for(int i=0;i<middle;i++){
					if(arr[i] == arr[N-1-i] ){
						continue;
					}
					else{
						System.out.println("no2");
						flag=0;
						break;
					}
				}
				if(flag==1){
					System.out.println("yes");
				}
			}

		}//tcase
	}
}