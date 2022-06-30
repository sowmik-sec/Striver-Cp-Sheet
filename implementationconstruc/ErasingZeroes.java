package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            String s = in.next();
            boolean ahs = false;
            int cnt =  0, ans = 0;
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i)=='0'&& s.charAt(i-1)=='1' && ahs==false) {
                    cnt = 1;
                    ahs = true;
                }
                else if(ahs && s.charAt(i)=='0') cnt++;
                else if(ahs && s.charAt(i)=='1') {
                    ans += cnt;
                    ahs = false;
                }
            }
            System.out.println(ans);
        }
    }
}
