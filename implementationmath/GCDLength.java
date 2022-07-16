package striverCpSheet.implementationmath;

import java.util.Scanner;

public class GCDLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            System.out.println((long)Math.pow(10,a-1)+" "+(long)(Math.pow(10,b-1)+Math.pow(10,c-1)));
        }
    }
}
