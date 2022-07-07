package striverCpSheet.implementationmath;

import java.util.Scanner;

public class CompetitiveProgrammer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0) {
            String s = in.next();
            String ans = "YES";
            boolean zero = false, even = false;
            int cnt = 0, ze = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='0'){
                    zero = true;
                    ze++;
                }
                else if((s.charAt(i)-'0')%2==0 && s.charAt(i)!='0') even = true;
                cnt += s.charAt(i)-'0';
            }
            if((zero && even && cnt%3==0) || (ze>=2 && cnt%3==0)) System.out.println("red");
            else System.out.println("cyan");
            //System.out.println(ans);
        }
    }
}
