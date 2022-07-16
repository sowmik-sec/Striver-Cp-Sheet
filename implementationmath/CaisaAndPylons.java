package striverCpSheet.implementationmath;

import java.util.Scanner;

public class CaisaAndPylons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(i==0) ans = a[i];
            if(a[i]>ans) {
                ans += a[i] - ans;
            }
        }
        System.out.println(ans);
    }
}
