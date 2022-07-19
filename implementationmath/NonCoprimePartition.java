package striverCpSheet.implementationmath;

import java.util.Scanner;

public class NonCoprimePartition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<3) System.out.println("No");
        else {
            System.out.println("Yes");
            System.out.print((n+1)/2+" ");
            for (int i = 1; i <=n ; i+=2) {
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.print(n/2+" ");
            for (int i = 2; i <=n ; i+=2) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
