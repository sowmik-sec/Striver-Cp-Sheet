package striverCpSheet.implementationmath;

import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long x = in.nextLong();
            long y = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long allPayInADolar = (x + y)*a;
            long partialPayInAB = Math.min(x,y)*b + (Math.max(x,y)-Math.min(x,y))*a;
            System.out.println(Math.min(allPayInADolar,partialPayInAB));
        }
    }
}
