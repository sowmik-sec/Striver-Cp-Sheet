package striverCpSheet.implementationmath;

import java.util.Scanner;

public class BerlandPoker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int cardPerPerson = n/k;
            if(cardPerPerson>=m) System.out.println(m);
            else {
                k--;
                m -= cardPerPerson;
                int b = m/k;
                if(m%k>0) b++;
                System.out.println(cardPerPerson-b);
            }
        }
    }
}
