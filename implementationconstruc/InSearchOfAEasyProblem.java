package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class InSearchOfAEasyProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        String ahs = "Easy";
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(a[i]==1) ahs = "Hard";
        }
        System.out.println(ahs);
    }
}
