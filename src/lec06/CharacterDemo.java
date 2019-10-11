package lec06;

public class CharacterDemo {
    public static void main(String[] args) {//#include<ctype.h>
        char[] s = "asjdfjklasdjklfajklsdfjklasdjklf127839127893789123789jJKJKL#$$%TY".toCharArray();
        int upper, lower, number, other, space;
        upper = lower = number = other = space = 0;
        for (char c : s) {
            if (Character.isLowerCase(c)) ++lower;
            else if (Character.isUpperCase(c)) ++upper;//c<='Z' && c>='A'
            else if (Character.isDigit(c)) ++number;
            else if (Character.isSpace(c)) ++space;
            else ++other;
        }
        System.out.println(String.format("%d %d %d %d %d", upper, lower, number, other, space));
    }
}
