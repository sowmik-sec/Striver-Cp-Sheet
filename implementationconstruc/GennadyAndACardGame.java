package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] st = new String[10];
        for (int i = 0; i < 5; i++) {
            st[i] = in.next();
        }
        String  ahs = "NO";
        for (int i = 0; i < 5; i++) {
            if(s.charAt(0)==st[i].charAt(0)) {
                ahs = "YES";
                break;
            }
            if(s.charAt(1) == st[i].charAt(1)) {
                ahs = "YES";
                break;
            }
        }
        System.out.println(ahs);
    }
}
