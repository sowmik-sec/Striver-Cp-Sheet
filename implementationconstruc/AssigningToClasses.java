package striverCpSheet.implementationconstruc;

import java.util.Arrays;
import java.util.Scanner;

public class AssigningToClasses {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n = in.nextInt();
            int[] a = new int[n*2];
            for (int i = 0; i < n*2; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[n]-a[n-1]);
        }
    }
}
