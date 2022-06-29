package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class CPlusEqualto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            long a = in.nextInt();
            long b = in.nextInt();
            long n = in.nextInt();
            long cnt = 0;
            while(true) {
                if(a>n || b>n) break;
                if(a>b) {
                    long temp = a;
                    a = b;
                    b = temp;
                }
                long temp = b;
                b+=a;
                a = temp;
                //System.out.println(a+" "+b);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
    static void swap(long a, long b) {
        long temp = a;
        a = b;
        b = temp;
    }
}
