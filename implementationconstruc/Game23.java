package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class Game23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        if(m%n!=0) {
            System.out.println(-1);
            return;
        }
        long div = m/n;
        int cnt = 0;
        while(true) {
            if(div==1) break;
            if(div%3==0) div/=3;
            else if(div%2==0) div/=2;
            else break;
            cnt++;
        }
        if(div==1) System.out.println(cnt);
        else System.out.println(-1);
    }
}
