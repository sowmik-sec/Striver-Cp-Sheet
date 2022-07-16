package striverCpSheet.implementationmath;

import java.util.Arrays;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t  = in.nextInt();
        while(t-->0) {
            int[] a = new int[3];
            int sum = 0;
            for (int i = 0; i <3; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            Arrays.sort(a);
            if(sum%9==0 && a[0]>=sum/9) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
