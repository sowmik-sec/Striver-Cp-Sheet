package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class PetrAndBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[7];
        for (int i = 0; i < 7; i++) {
            a[i] = in.nextInt();
        }
        int index = 0;
        int cnt = 0;
        while(true) {
            if(index>=7) index = 0;
            if(n>a[index]) {
                n-=a[index];
            }
            else n= 0;
            if(n==0) break;
            cnt++;
            index++;
        }
        System.out.println(index+1);
    }
}
