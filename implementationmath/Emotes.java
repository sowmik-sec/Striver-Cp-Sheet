package striverCpSheet.implementationmath;

import java.util.Arrays;
import java.util.Scanner;

public class Emotes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long m = in.nextInt();
        long k = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        long temp = m/(k+1);
        long temp2 = m-temp;
        if(n==1) {
            System.out.println(temp2*a[n-1]);
        }
        System.out.println(temp2*a[n-1]+temp*a[n-2]);
    }
}
