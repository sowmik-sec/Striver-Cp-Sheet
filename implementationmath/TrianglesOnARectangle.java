package striverCpSheet.implementationmath;

import java.util.Scanner;

public class TrianglesOnARectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long w = in.nextLong();
            long h = in.nextLong();
            long mx = -1;
            for (int i = 0; i < 4; i++) {
                long x = in.nextLong();
                long f = -1,s = - 1;
                for (int j = 0; j < x; j++) {
                    long temp = in.nextLong();
                    if(j==0) f = temp;
                    if(j==x-1) s = temp;
                }
                if(i<2) {
                    mx = Math.max(mx, (s-f)*h);
                }
                else mx = Math.max(mx,(s-f)*w);
            }
            System.out.println(mx);
        }
    }
}
