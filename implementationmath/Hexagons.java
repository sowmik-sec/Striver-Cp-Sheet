package striverCpSheet.implementationmath;

import java.util.Scanner;

public class Hexagons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long a = 6 + (n-1)*6;
        long b = (n*(6+a))/2;
        System.out.println(b+1);
    }
}
