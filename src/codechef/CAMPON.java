package codechef;

import java.util.Scanner;

public class CAMPON {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int d = sc.nextInt();
			int arr[][] = new int[d][2];
			for(int i=0;i<d;i++) {
				arr[i][0]=sc.nextInt(); // problem solved 
				arr[i][1]=sc.nextInt(); // on days
			}	
			int q=sc.nextInt();
			while(q-->0) {
				int total=0;
				int deadi = sc.nextInt(); //by this day
				int reqi = sc.nextInt(); // no of problem need to be solved 
				for(int i=0;i<d;i++) {
					if(deadi < arr[i][0]) {
						System.out.println("Go Sleep");
						break;
					}
					else {
						total+=arr[i][1];
						if(total >=reqi) {
							System.out.println("Go Camp");
							break;
						}
					}
				}
			}
		}
	}
}