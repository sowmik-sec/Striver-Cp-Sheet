package striverCpSheet.implementationmath;

import java.util.Scanner;

public class WaterLily {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double h = in.nextDouble();
        double l = in.nextDouble();
        double ans = (Math.pow(l,2)-Math.pow(h,2))/(2*h);
        System.out.printf("%.10f",ans);
    }
}
