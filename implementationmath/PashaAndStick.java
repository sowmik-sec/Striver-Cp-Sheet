package striverCpSheet.implementationmath;

import java.util.Scanner;

public class PashaAndStick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==1 || n<6) System.out.println(0);
        else {
            n/=2;
            System.out.println((n-1)/2);
        }
    }
}
