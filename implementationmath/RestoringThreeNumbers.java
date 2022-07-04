package striverCpSheet.implementationmath;

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println((a[3]-a[0])+" "+(a[3]-a[1])+" "+(a[3]-a[2]));
    }
}
