package striverCpSheet.implementationmath;

import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            if(n%2==1) {
                System.out.println(n/2);
            }
            else System.out.println(n/2-1);
        }
    }
}
