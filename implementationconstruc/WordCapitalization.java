package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = Character.toString(Character.toUpperCase(s.charAt(0)));
        t += s.substring(1);
        System.out.println(t);
    }
}
