package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            String n = in.next();
            int first = n.charAt(0)-'0';
            int ans = (first-1)*10;
            ans += (n.length()*(n.length()+1)/2);
            System.out.println(ans);
        }
    }
}
