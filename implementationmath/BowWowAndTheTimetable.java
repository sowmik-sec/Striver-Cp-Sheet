package striverCpSheet.implementationmath;

import java.util.Scanner;

public class BowWowAndTheTimetable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0,j = 0;
        String s = in.next();
        int n = s.length();
        int cnt = 0;
        for ( j = 1; j <=n; j+=2) {
            cnt++;
        }
        int one = 0;
        for (int k = 0; k < s.length(); k++) {
            if(s.charAt(k)=='1') one++;
        }
        if(s.equals("0")) System.out.println(0);
        else if(one==1 && s.length()%2==1) System.out.println(cnt-1);
        else System.out.println(cnt);
    }
}
