package striverCpSheet.implementationmath;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int r = in.nextInt();
        int cnt = 1;
        while(true) {
            int temp = k*cnt;
            if(temp%10==r || temp%10==0) break;
            cnt++;
        }
        //System.out.println(k);
        System.out.println(cnt);
    }
}
