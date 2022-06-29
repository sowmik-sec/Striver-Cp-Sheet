package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String ans = new String();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(0)=='9' && i==0) ans += s.charAt(0);
            else {
                int a = s.charAt(i)-'0';
                int b = 9-a;
                ans += Math.min(a,b);
            }
        }
        System.out.println(ans);
    }
}
