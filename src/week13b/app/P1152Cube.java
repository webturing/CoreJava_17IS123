package week13b.app;

public class P1152Cube {

	/**
	 * @param args
	 */
	public static void main(String[] args) {//O(n^3)
		int n=2000;
		long start=System.currentTimeMillis();
		for(int a=1;a<=n;a++){
			for(int b=a+1;b<=n;b++){
				int s=0;
				for(int i=a;i<=b;i++){
					s+=i;
				}
				if(s==n){
					System.out.println(a+" "+b);
				}
			}
		}
		
		
		long end=System.currentTimeMillis();
		System.out.println((end-start)/1000.0+"Second(s).");

	}

}
