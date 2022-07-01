package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class PresentFromLena {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <= n*2; i++) {
            if(i==0 || i==n*2) {
                for (int j = 0; j < 2*n; j++) {
                    System.out.print(" ");
                }
                System.out.println(0);
                continue;
            }
            //System.out.print(0+" ");
            if(i<=n) {
                for (int j = 0; j < 2*(n-i); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(j+" ");
                }
                for (int j = i-1; j >0; j--) {
                    System.out.print(j+" ");
                }
                System.out.println(0);
            }
            else {
                for (int j = 0; j < 2*(i-n); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <=2*n-i ; j++) {
                    System.out.print(j+" ");
                }
                for (int j = 2*n-i-1; j >0 ; j--) {
                    System.out.print(j+" ");
                }
                System.out.println(0);
            }
            //System.out.println();
        }
    }
}
