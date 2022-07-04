package striverCpSheet.implementationmath;

import java.util.Scanner;

public class LCMPromlem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long l = in.nextInt();
            long r = in.nextInt();
            long x = -1, y = -1;
            if(l*2>r) {
                System.out.println("-1 -1");
            }
            else System.out.println(l+" "+l*2);
        }
    }
}
