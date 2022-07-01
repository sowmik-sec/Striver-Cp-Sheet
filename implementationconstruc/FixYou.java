package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class FixYou {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n = in.nextInt();
            int m = in.nextInt();
            String[] ch = new String[n];
            for (int i = 0; i < n; i++) {
                ch[i] = in.next();
            }
            int up = 0;
            for (int i = 0; i < n-1; i++) {
                if(ch[i].charAt(m-1)!='D') up++;
            }
            for (int i = 0; i < m-1; i++) {
                if(ch[n-1].charAt(i)!='R') ++up;
            }
            System.out.println(up);
        }
    }
}
