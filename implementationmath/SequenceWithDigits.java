package striverCpSheet.implementationmath;

import java.util.Scanner;

public class SequenceWithDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long a = in.nextLong();
            long k = in.nextLong();
            for (long i = 1; i < k; i++) {
                long mx = maxDigit(a);
                long mn = minDigit(a);
                a = a + mx*mn;
                if(mn==0) break;
            }
            System.out.println(a);
        }
    }

    private static long minDigit(long a) {
        long mn = Integer.MAX_VALUE;
        while(a>0) {
            long b = a%10;
            mn = Math.min(b,mn);
            a/=10;
        }
        return mn;
    }

    private static long maxDigit(long a) {
        long mx = -1;
        while(a>0) {
            long b = a%10;
            mx = Math.max(b,mx);
            a/=10;
        }
        return mx;
    }
}
