package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b;
        int mx = Integer.MIN_VALUE;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            a = in.nextInt();
            b = in.nextInt();
            cur-=a;
            cur+=b;
            mx = Math.max(mx,cur);
        }
        System.out.println(mx);
    }
}
