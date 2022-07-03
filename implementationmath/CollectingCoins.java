package striverCpSheet.implementationmath;

import java.util.Arrays;
import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = in.nextInt();
            }
            int n = in.nextInt();
            Arrays.sort(a);
            int sum = a[2]-a[0] + a[2] - a[1];
            if(n<sum) {
                System.out.println("NO");
                continue;
            }
            n-=sum;
            if(n%3==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
