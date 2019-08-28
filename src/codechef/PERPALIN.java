package codechef;

import java.util.Scanner;

class PERPALIN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int p=sc.nextInt();
			if(p==1 || (p==2 && n==2)){
				System.out.println("impossible");
				continue;
			}
			char []temp=new char[n];
			if(n==p){
				for(int i=0,j=n-1;i<=j;i++,j--){
						if(i%2==0){
							temp[i]='a';
							temp[j]='a';
						}
						else{
							temp[i]='b';
							temp[j]='b';
						}
				}
				for(char c:temp){
					System.out.print(c);
				}
			 	System.out.println();
			}
			else{
				int tr=n/p;   //6 3  =2*3
				while(tr-->0){
					for(int i=1;i<=p;i++){
						if(i%2==0){
							System.out.print("b");
						}
						else{
							System.out.print("a");
						}
					}
				}
			}
		}
	}
} 