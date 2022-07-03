package striverCpSheet.implementationmath;

import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n =in.nextInt();
            System.out.println((n+1)/2);
        }
    }
}
