package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans = new String();
        for (int i = 0; i < s.length(); i++) {
            if(!isVowel(s.charAt(i))) {
                ans += '.';
                ans += Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if(c=='a' || c=='e' || c == 'i' || c=='o' || c=='u' || c=='y') return true;
        return false;
    }
}
