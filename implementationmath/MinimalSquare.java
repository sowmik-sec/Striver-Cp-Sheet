package striverCpSheet.implementationmath;

import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int mn = Math.min(a,b);
            int temp = -1;
            if(mn==a) temp = Math.max(a*2,b);
            else temp = Math.max(b*2,a);
            System.out.println(temp*temp);
        }
    }
}
