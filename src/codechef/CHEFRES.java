package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * 
1
4 5
5 7
9 10
2 3
20 30
5
6
7
35
1
===========
0
0
2
-1
1
===========
 */
public class CHEFRES {
	public static void main(String[] args) {
		
		inputs sc=new inputs(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			long a[]= new long[n];
			long b[]= new long[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
				b[i]=sc.nextLong();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			
			for(int i=0;i<m;i++) {
				int l=0;
				int u=n-1;
				int mid=0;		
				long p=sc.nextLong();
				if(p<a[0]) {
					System.out.println(a[0]-p);
				}
				else if(p>=b[n-1]) {
					System.out.println("-1");
				}
				else {
				    long min=Long.MAX_VALUE;
				    int flag=0;
					while(l<=u)
					{
						mid=(l+u)/2;
						if(a[mid]<=p && p<b[mid])
						{
							System.out.println("0");
							flag=1;
							break;
						}
						else if(p<a[mid])
						{
							u=mid-1;
							if(a[mid]-p<min)
							min=a[mid]-p;
						}
						else if(p>a[mid])
						{
							l=mid+1;
						}
					}
					if(flag==0)
					System.out.println(min);
				}
			}
		}
	}
}

class inputs
{
    public BufferedReader reader;
    public StringTokenizer token;

    inputs(InputStream str)
    {
        reader=new BufferedReader(new InputStreamReader(str));
        token=null;
    }

    int nextInt()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Integer.parseInt(token.nextToken());
    }

    long nextLong()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return Long.parseLong(token.nextToken());
    }

    String next()
    {
        while(token==null||!token.hasMoreTokens())
        {
            try { token=new StringTokenizer(reader.readLine());   }
            catch(IOException e){  throw new RuntimeException(e); }
        }
        return token.nextToken();
    }

}
