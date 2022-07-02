package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class RoomsAndStaircases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n = in.nextInt();
            String s = in.next();
            int f = -1, ss = -1;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i)=='1') {
                    f = i+1;
                    //break;
                }
            }
            for (int i = n-1; i >=0 ; i--) {
                if(s.charAt(i)=='1') {
                    ss = i;
                }
            }
            if(f==-1 && ss==-1) {
                System.out.println(n);
            }
            else {
                int mx = Math.max(f,n-ss);
                System.out.println(mx*2);
            }
        }
    }
}
