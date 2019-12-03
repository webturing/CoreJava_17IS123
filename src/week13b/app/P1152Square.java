package week13b.app;

public class P1152Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {//O(n^3)
		int n=20000;
		long start=System.currentTimeMillis();
		for(int a=1;a<=n;a++){
			for(int b=a+1;b<=n;b++){
				int s=(a+b)*(b-a+1)/2;
				if(s==n){
					System.out.println(a+" "+b);
				}
			}
		}
		
		
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000.0+"Second(s).");

	}

}
