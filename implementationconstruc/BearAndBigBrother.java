package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int cnt = 0;
        while(a<=b) {
            a*=3;
            b*=2;
            cnt++;
        }
        //if(a<b)cnt++;
        System.out.println(cnt);
    }
}
