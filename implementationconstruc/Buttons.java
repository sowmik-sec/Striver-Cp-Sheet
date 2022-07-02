package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for (int i = n; i >0 ; i--) {
            int temp = n-i;
            int temp2 = i-1;
            ans += temp*temp2+i;
        }
        System.out.println(ans);
    }
}
