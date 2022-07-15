package striverCpSheet.implementationmath;

import java.util.Scanner;

public class StringLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            String a = in.next();
            String b = in.next();
            int l = lcm(a.length(),b.length());
            if(b.length()<a.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            String tempAns = new String();
            for (int i = 0; i < l/a.length(); i++) {
                tempAns += a;
            }
            boolean ahs = true;
            for (int i = 0; i < tempAns.length();) {
                String temp = tempAns.substring(i,b.length()+i);
                if(!temp.equals(b)) {
                    ahs = false;
                    break;
                }
                i += b.length();
            }
            if(!ahs) {
                System.out.println(-1);
            }
            else {
                System.out.println(tempAns);
            }
        }
    }

    private static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
