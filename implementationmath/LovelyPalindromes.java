package striverCpSheet.implementationmath;

import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder b = new StringBuilder(s);
        String ans = s + b.reverse();
        System.out.println(ans);
    }
}
