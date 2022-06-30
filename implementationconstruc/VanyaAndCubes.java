package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 1;
        int cur = 0;

        while(cur<n) {
            cur += cnt*(cnt+1)/2;
            cnt++;
            //System.out.println(cur);
        }
        if(cur==n) System.out.println(cnt-1);
        else System.out.println(cnt-2);
    }
}
