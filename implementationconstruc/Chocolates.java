package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        long ans = a[n-1];
        long last = a[n-1];
        for (int i = n-2; i >=0 ; i--) {
            if(a[i]<last) {
                if(last==1) break;
                ans += a[i];
                last = a[i];
            }
            else {
                if(last==1) break;
                ans += last-1;
                last = last-1;
            }
        }
        System.out.println(ans);
    }
}
