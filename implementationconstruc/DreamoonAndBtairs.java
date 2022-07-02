package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class DreamoonAndBtairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int min = (n+1)/2;
        int ans = -1;
        for (int i = min; i <=n ; i++) {
            if(i%m==0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
