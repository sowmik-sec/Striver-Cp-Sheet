package striverCpSheet.implementationmath;

import java.util.Scanner;

public class ThreePairwiseMaximums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t  = in.nextInt();
        while(t>0) {
            t--;
            int[] a = new int[3];
            int mx = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                a[i] = in.nextInt();
                mx = Math.max(mx,a[i]);
            }
            int[] b = new int[3];
            b[0] = Math.min(a[0],a[1]);
            b[1] = Math.min(a[1],a[2]);
            b[2] = Math.min(a[0],a[2]);
            int mx2 = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                mx2 = Math.max(mx2,b[i]);
            }
//            for (int i = 0; i < 3; i++) {
//                System.out.print(b[i]+" ");
//            }
            //System.out.println();
            if(a[0]==a[1] && a[1]==a[2]) {
                System.out.println("YES");
                for (int i = 0; i < 3; i++) {
                    System.out.print(a[i]+" ");
                }
                System.out.println();
                continue;
            }
            if(mx2!=mx) {
                System.out.println("NO");
                continue;
            }
            else {
                System.out.println("YES");
                for (int i = 0; i < 3; i++) {
                    System.out.print(b[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
