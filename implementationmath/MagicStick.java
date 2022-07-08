package striverCpSheet.implementationmath;

import java.util.Scanner;

public class MagicStick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            long x = in.nextInt();
            long y = in.nextInt();
            long a = (x*3)/2;
            long b = ((x-1)*3)/2;
            if(x>=y) System.out.println("YES");
            else if(x%2==1 && b==x ||(x==1 && y>1)) System.out.println("NO");
            else if(x%2==0 && a==x+1 && a!=y) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
