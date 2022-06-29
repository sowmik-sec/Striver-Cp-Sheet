package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        long a = w*(w+1)/2;
        a *= k;
        if(n>=a) System.out.println(0);
        else System.out.println(a-n);
    }
}
