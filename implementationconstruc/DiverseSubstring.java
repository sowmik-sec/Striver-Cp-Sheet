package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class DiverseSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String ans = "NO";
        if(n==1) {
            System.out.println(ans);
            return;
        }
        for (int i = 1; i < n; i++) {
            if(s.charAt(i)!=s.charAt(i-1)) {
                ans = Character.toString(s.charAt(i-1));
                ans += s.charAt(i);
                break;
            }
        }
        if(ans.equals("NO")) System.out.println(ans);
        else System.out.println("YES\n"+ans);
    }
}
