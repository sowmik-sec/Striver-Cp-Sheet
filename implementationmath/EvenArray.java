package striverCpSheet.implementationmath;

import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int cnt =0, cnt2 = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if(i%2==0 && a[i]%2==1) cnt++;
                else if(i%2==1 && a[i]%2==0) cnt2++;
            }
            if(cnt!=cnt2) System.out.println(-1);
            else System.out.println(cnt);
        }
    }
}
