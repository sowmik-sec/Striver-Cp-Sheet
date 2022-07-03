package striverCpSheet.implementationmath;

import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n = in.nextInt();
            int x = in.nextInt();
            int cnt = 1;
            n-=2;
            while(n>0) {
                cnt++;
                n-=x;
            }
            System.out.println(cnt);
        }
    }
}
