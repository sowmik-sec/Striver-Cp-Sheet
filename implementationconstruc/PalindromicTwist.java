package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class PalindromicTwist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n = in.nextInt();
            String s = in.next();
            String ans = "YES";
            for (int i = 0; i < n/2; i++) {
                int a = s.charAt(i)-'a';
                int b = s.charAt(n-i-1)-'a';
                char ch = s.charAt(i);
                char ch2 = s.charAt(n-i-1);
                int temp = Math.abs(a-b);
                //System.out.println(a+" "+b+" "+(a-b));
                if(temp==1) {
                    ans = "NO";
                    break;
                }
                else if(temp>2) {
                    ans = "NO";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
