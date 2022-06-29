package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        in.nextLine();
        for (int i = 0; i < n; i++) {
            //in.next();
            String s = in.nextLine();
            //System.out.println(s);
            int cntp = 0, cntm = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='+')++cntp;
                else if(s.charAt(j)=='-') ++cntm;
            }
            ans+= (cntp/2);
            ans-= (cntm/2);
            //System.out.println(cntp+" "+cntm);
        }
        System.out.println(ans);
    }
}
