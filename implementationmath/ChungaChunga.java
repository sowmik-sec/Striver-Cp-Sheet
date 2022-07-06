package striverCpSheet.implementationmath;

import java.util.Scanner;

public class ChungaChunga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        long z = in.nextLong();
        long a = x%z;
        long b = y%z;
        //System.out.println((a+b)%z);
        long c = (a+b)/z;
        long rem = 0;
        long ans = x/z + y/z;
        if(c>0) {
            ans++;
            rem = z-Math.max(a,b);
        }
        System.out.println(ans+" "+rem);
    }
}
