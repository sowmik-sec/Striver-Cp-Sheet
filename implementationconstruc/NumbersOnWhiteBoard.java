package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class NumbersOnWhiteBoard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            System.out.println(2);
            if(n==2) {
                System.out.println("2 1");
                continue;
            }
            System.out.println(n+" "+(n-2));
            System.out.println((n-1)+" "+(n-1));
            for (int j = n-1; j >=3 ; j--) {
                System.out.println(j+" "+(j-2));
            }
        }
    }
}
