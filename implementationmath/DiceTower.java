package striverCpSheet.implementationmath;

import java.util.Scanner;

public class DiceTower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0) {
            long x = in.nextLong();
            long a = x/14;
            long rem = x%14;
            if(a>=1 && rem>=1 && rem<=6) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
