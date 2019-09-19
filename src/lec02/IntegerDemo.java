package lec02;

public class IntegerDemo {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);//2^31-1 21��
		System.out.println(Integer.toBinaryString(1023));
		System.out.println(Integer.toBinaryString(-1));
		System.out.println(Integer.toString(1023, 2));
		String s="111";
		System.out.println(Integer.parseInt(s,2));//7
		
		System.out.println(Integer.parseInt(s,16));//256+16+1

	}

}
