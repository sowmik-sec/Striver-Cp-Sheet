package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class LuckySumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ans = new String();
        int temp = n/7;
        int rem = n%7;
        boolean ahs = false;
        int four = -1;
        while(true) {
            if(temp<0) break;
            if((n-temp*7)%4==0) {
                ahs = true;
                four = (n-temp*7)/4;
                break;
            }
            temp--;
        }
        if(ahs) {
            char[] ch = new char[four+temp];
            for(int i=0;i<four;i++) System.out.print(4);
            for(int i=four;i<(temp+four);i++) System.out.print(7);
            System.out.println();
        }else {
            System.out.println(-1);
        }
    }
}
