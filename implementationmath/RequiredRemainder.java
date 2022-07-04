package striverCpSheet.implementationmath;

import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int x = in.nextInt();
            int y = in.nextInt();
            int n = in.nextInt();
            if(n%x==y) {
                System.out.println(n);
                continue;
            }
            else if(n<x) {
                System.out.println(y);
                continue;
            }
            int temp = n/x;
            if(temp*x+y<=n) System.out.println(temp*x+y);
            else System.out.println((temp-1)*x+y);
        }
    }
}
