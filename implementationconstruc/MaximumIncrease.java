package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int cnt = 1;
        int mx = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(a[i]<=a[i-1]) {
                mx = Math.max(mx,cnt);
                cnt = 1;
            }
            else if(a[i]>a[i-1]) cnt++;
        }
        mx = Math.max(mx,cnt);
        System.out.println(mx);
    }
}
