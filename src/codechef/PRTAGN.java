package codechef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PRTAGN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int q=sc.nextInt();
			HashSet<Integer>hs= new HashSet<Integer>();
			while(q-->0) {
				int n=sc.nextInt();
				if(!hs.contains(n)) {
					calculateBits(hs,n);							
				}				
			}
			//System.out.println(hs);
		}
	}

	private static void calculateBits(HashSet<Integer> hs,int entry) {
		// TODO Auto-generated method stub
		int even1=0;
		int odd1=0;
		ArrayList<Integer>al= new ArrayList<Integer>();

		for(int temp:hs) {
			if(temp!=entry) {
				al.add(temp^entry);				
			}
		}
		hs.addAll(al);
		hs.add(entry);	
		for(int n:hs) {
			if(countSetBits(n)%2==0) {
				even1++;
			}
			else {
				odd1++;
			}
		}
		//System.out.println(hs);
		System.out.println(even1+" "+odd1);
	}
	static int countSetBits(int n) { 
        int count = 0; 
        while (n > 0) { 
            count += n & 1; 
            n >>= 1; 
        } 
        return count; 
    } 
}
