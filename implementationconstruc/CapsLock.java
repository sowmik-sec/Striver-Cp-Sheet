package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans = new String();
        if(s.length()==1) {
            if(isLower(s.charAt(0))) System.out.println(Character.toUpperCase(s.charAt(0)));
            else System.out.println(Character.toLowerCase(s.charAt(0)));
            return;
        }
        if(isUpper(s.charAt(0))) {
            int cnt = 0;
            for (int i = 1; i < s.length(); i++) {
                if(isUpper(s.charAt(i))) {
                    cnt++;
                }
            }
            if(cnt==s.length()-1) {
                for (int i = 0; i < s.length(); i++) {
                    ans += Character.toLowerCase(s.charAt(i));
                }
            }
            else ans = s;
        }
        else if(isLower(s.charAt(0))) {
            int cnt = 0;
            for (int i = 1; i < s.length(); i++) {
                if(isUpper(s.charAt(i))) {
                    cnt++;
                }
            }
            if(cnt==s.length()-1) {
                ans += Character.toUpperCase(s.charAt(0));
                for (int i = 1; i < s.length(); i++) {
                    ans += Character.toLowerCase(s.charAt(i));
                }
            }
            else ans = s;
        }
        else ans = s;
        System.out.println(ans);
    }
    static boolean isLower(char c) {
        if(c>='a' && c<='z') return true;
        return false;
    }
    static boolean isUpper(char c) {
        if(c>='A' && c<='Z') return true;
        return false;
    }
}
