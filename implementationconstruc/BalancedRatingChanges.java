package striverCpSheet.implementationconstruc;

import java.util.ArrayList;
import java.util.Scanner;

public class BalancedRatingChanges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int odd = 0;
        ArrayList<Integer> oddlist = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int pos = 0, neg = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if(Math.abs(a[i])%2==1) {
                ++odd;
            }
        }
        int cnt = 0;
        //System.out.println("odd = "+odd+" pos,neg = "+pos+","+neg);
        for (int i = 0; i < n; i++) {
            if(a[i]%2==0) ans.add(a[i]/2);
            else {
                if(cnt<odd/2) {
                    if(a[i]>0) ans.add(a[i]/2);
                    else ans.add(a[i]/2-1);
                }
                else {
                    if(a[i]>0) ans.add((a[i]+1)/2);
                    else ans.add(a[i]/2);
                }
                cnt++;
            }
        }
        for (int num : ans) System.out.println(num);
        System.out.println();
    }
}
