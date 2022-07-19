package striverCpSheet.implementationmath;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long mul = 2,ans = 0;
        for (int i = 1; i <=n; i++) {
            ans += mul;
            mul *= 2;
        }
        System.out.println(ans);
    }
}
