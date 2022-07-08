package striverCpSheet.implementationmath;

import java.util.Scanner;

public class DrazilAndDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long s = in.nextLong();
        long sum = Math.abs(a) + Math.abs(b);
        if(s<sum) System.out.println("No");
        else {
            long temp = s-sum;
            if(temp%2==0) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
