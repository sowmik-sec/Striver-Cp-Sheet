package striverCpSheet.implementationmath;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();
        long x = 0, y = 0;
        if(n%a!=0) {
            x = n/a+1;
        }
        else x = n/a;
        if(m%a!=0) {
            y = m/a+1;
        }
        else y = m/a;
        System.out.println(x*y);
    }
}
