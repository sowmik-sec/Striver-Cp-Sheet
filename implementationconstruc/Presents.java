package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[101];
        for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                b[a[i]] = i+1;
        }
        for (int i = 0; i < 101; i++) {
            if(b[i]>0) {
                System.out.print(b[i]+" ");
            }
        }
        System.out.println();
    }
}
