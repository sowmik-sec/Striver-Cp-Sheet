package striverCpSheet.implementationmath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DrinksChoosing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[k+1];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            b[a[i]]++;
        }
        int ans = 0, cnt = 0;
        int set = (n+1)/2;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <=k; i++) {
            if(b[i]%2==0) {
                ans += b[i];
                set -= (b[i]/2);
            }
            else {
                if(b[i]>1) list.add(b[i]);
                else cnt++;
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        if(list.size()%2==0) {
            for (int i = 0; i < list.size()/2; i++) {
                ans += list.get(i);
                set -= ((list.get(i)+1)/2);
            }
            for (int i = list.size()/2; i < list.size(); i++) {
                ans += list.get(i)-1;
                set -= list.get(i)/2;
            }
        }
        else {
            for (int i = 0; i <= list.size()/2; i++) {
                ans += list.get(i);
                set -= ((list.get(i)+1)/2);
            }
            for (int i = list.size()/2+1; i < list.size(); i++) {
                if(i<list.size()-1) {
                    ans += list.get(i)-1;
                    set -=list.get(i)/2;
                }
                else {
                     ans += list.get(i)-1;
                     set -= list.get(i)/2;
                }
            }
        }
        ans += Math.min(cnt,set);
        System.out.println(ans);
    }
}
