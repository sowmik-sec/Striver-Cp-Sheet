package striverCpSheet.implementationmath;

import java.util.Scanner;

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            long n = in.nextInt();
            long m = in.nextInt();
            if(n==1) System.out.println(0);
            else if(n>2) System.out.println(m*2);
            else System.out.println(m);
        }
    }
}
