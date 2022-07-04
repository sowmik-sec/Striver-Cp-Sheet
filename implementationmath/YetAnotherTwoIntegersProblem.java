package striverCpSheet.implementationmath;

import java.util.Scanner;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int temp = -1;
            if(b==a) {
                System.out.println(0);
                continue;
            }
            else if(b<a) {
                temp = a-b;
            }
            else {
                temp = b-a;
            }
            if(temp%10>0) System.out.println(temp/10+1);
            else System.out.println(temp/10);
        }
    }
}
