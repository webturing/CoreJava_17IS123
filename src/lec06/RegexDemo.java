package lec06;

public class RegexDemo {
    public static void main(String[] args) {
        String s="To know everyting is to know. nothing?";
        System.out.println(s.toLowerCase().replaceAll("\\W+"," "));
    }
}
