package striverCpSheet.implementationmath;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            if(n%4!=0) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                int cnt1 = 0, cnt2 = 0;
                for (int i = 2; i <=n; i+=2) {
                    System.out.print(i+" ");
                    cnt1 += i;
                }
                for (int i = 1; i < n-1; i+=2) {
                    System.out.print(i+" ");
                    cnt2 += i;
                }
                System.out.println(cnt1-cnt2);
            }
        }
    }
}
