package lec02;

public class CharacterDemo {

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 97;
        System.out.println(Integer.toHexString(97));
        char c3 = '\u0061';
        System.out.println("" + c1 + c2 + c3);
        System.out.println("Java程序设计".length());

        //output 'A' to 'Z'
        for (char c = 'A'; c <= 'Z'; c++) System.out.print(c);
        System.out.println();
        //output 'a' to 'z'a
        for (int i = 0; i < 26; i++) System.out.print((char) (i + 'a'));
        System.out.println();


    }

}
