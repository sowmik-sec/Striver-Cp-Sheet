package striverCpSheet.implementationmath;

import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n = in.nextInt();
            int m = in.nextInt();
            int ans = 0;
            if(n%2==1) {
                ans = (n/2)*m + (m+1)/2;
            }
            else ans = (n/2)*m;
            System.out.println(ans);
        }
    }
}
