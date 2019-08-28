package codechef;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class SEGPROD {
	public static void main(String[] args) {
	    FastReader sc=new FastReader();
		int t = sc.nextInt();  
        long res[]= new long[t];    
		while(t!=0){
		    t--;
		    int n=sc.nextInt();
			int p=sc.nextInt();
			int q=sc.nextInt();
			
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt()%p;
			}
						
			int tt= (int)(Math.floor(q/64))+2;
			int brr[]=new int[tt];
			for(int i=0;i<tt;i++){
				brr[i]=sc.nextInt();
			}
			
			long x=0;
			long li=0;
			long ri=0;
			long li_pre=0;
			long ri_pre=0;
			
			for(int i=0;i<q;i++){
				long result=1;
				if(i%64==0){
					li=( (long)brr[i/64] + x)%n;
					ri=( brr[(i/64)+1]+x)%n;
				}else{
					li=(li_pre+x)%n;
					ri=(ri_pre+x)%n;
				}
				if(li>ri){
					long temp=li;
					li=ri;
					ri=temp;
				}
				li_pre=li;
				ri_pre=ri;
				for(long start=li;start<=ri;start++){
					result= result*arr[(int) start];
					result= result%p;
				}
				x=(int)(result+1)%p;
				//System.out.println("x: "+x);
			}
			res[t]=x;		    	
		}
		for(int kk=res.length-1;kk>=0;kk--){
			System.out.println(res[kk]);
		}		
   }
   static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}