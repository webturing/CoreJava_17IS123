package p1;

public class Point extends java.lang.Object {//context
	
	public Point(int x) {
		this(x,0);
	}
	public Point() {
		this(0);
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		Point a=new Point();//0,0
		Point b=new Point(3);//(3,0)
		Point c=new Point(3,4);//3,4
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(c);
		
	}
	int x,y;
	
	int max(int a,int b){//delegate 
		return max(a,b,0);
	}
	int max(int a,int b,int c){
		int t=a;
		if(b>t)t=b;
		if(c>t)t=c;
		return t;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d,%d)",x,y);
	}
	
}
