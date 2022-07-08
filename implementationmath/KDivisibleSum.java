package striverCpSheet.implementationmath;

import java.util.Scanner;

public class KDivisibleSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int k = in.nextInt();
            if(n>k && k!=1 && n%k>0) {
                System.out.println(2);
            }
            else {
                if(n==1) System.out.println(k);
                else if(k%n>0) System.out.println(k/n+1);
                else System.out.println(k/n);
            }
        }
    }
}
