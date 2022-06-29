package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int inmx = -1, inmn = -1;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(a[i]>mx) {
                mx = a[i];
                inmx = i;
            }
        }
        for(int i=n-1;i>=0;i--) {
            if(a[i]<mn) {
                mn = a[i];
                inmn = i;
            }
        }
        int ans = 0;
        ans += inmx + (n-1-inmn);
        if(inmx>inmn) ans--;
        System.out.println(ans);
    }
}
