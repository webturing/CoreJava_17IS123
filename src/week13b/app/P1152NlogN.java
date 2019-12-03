package app;

import java.util.Arrays;

public class P1152NlogN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {//O(NlogN)
		int n=2000000;
		long start=System.currentTimeMillis();
		long s[]=new long[n+1];
		for(int i=1;i<=n;i++)s[i]=i;
		for(int i=1;i<=n;i++)s[i]+=s[i-1];
		//System.out.println(Arrays.toString(s));
		for(int i=0;i<=n;i++){
			long x=s[i];
			long k=x+n;
			int p=Arrays.binarySearch(s, k);
			if(p<0||p==i+1)continue;
			System.out.println(i+1+" "+p);
		}
		
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000.0+"Second(s).");

	}

}
