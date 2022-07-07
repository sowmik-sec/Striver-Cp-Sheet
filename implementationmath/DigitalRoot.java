package striverCpSheet.implementationmath;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long k = in.nextLong();
            long x = in.nextLong();
            System.out.println((long)9*(k-1)+x);
        }
    }
}
