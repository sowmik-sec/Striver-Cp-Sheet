package striverCpSheet.implementationmath;

import java.util.Scanner;

public class Heating {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a>=b) {
                System.out.println(b);
            }
            else {
                int rem = b%a;
                int c = b/a;
                double ans = Math.pow(c+1,2)*rem + Math.pow(c,2)*(a-rem);
                System.out.println((long)ans);
            }
        }
    }
}
