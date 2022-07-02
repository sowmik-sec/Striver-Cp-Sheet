package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class DonutShops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            long a = in.nextInt();
            long b = in.nextInt();
            long c = in.nextInt();
            if(a>=c) {
                System.out.println(-1+" "+b);
            }
            else if(a*b<=c) {
                System.out.println(1+" "+-1);
            }
            else if(a*b>c) {
                System.out.println(1+" "+b);
            }
        }
    }
}
