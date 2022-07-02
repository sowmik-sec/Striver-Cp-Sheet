package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class NewYearTransportation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <n ; i++) {
            a[i] = in.nextInt();
        }
        int sum = 1,index = 1;
        String ans = "NO";
        while(true) {
            if(sum>t) break;
            if(sum==t) {
                ans = "YES";
                break;
            }
            sum += a[sum];
        }
        System.out.println(ans);
    }
}
