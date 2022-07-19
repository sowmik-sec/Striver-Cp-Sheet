package striverCpSheet.implementationmath;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }
        Arrays.sort(a);
        boolean ahs = true;
        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            if(i==n-1) {
                if(a[n-2]+a[0]<=a[n-1]) {
                    if(a[n-2]+a[n-3]>a[n-1]) {
                        //System.out.println("hey");
                        //System.out.println(a[n-2]+" "+a[n-1]);
                        ans[n-1] = a[n-2];
                        ans[n-2] = a[n-1];
                        //System.out.println(ans[n-2]+" "+ans[n-1]);
                        break;
                    }
                    else {
                        ahs = false;
                        break;
                    }
                }
                else ans[i] = a[i];
            }
            else ans[i] = a[i];
        }


        if(!ahs) System.out.println("NO");
        else {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
