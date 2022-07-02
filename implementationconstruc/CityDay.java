package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class CityDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        if(n==1) {
            System.out.println(1);
            return;
        }
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            int cnt1 = 0, cnt2 = 0;
            if(i==1) {
                int j=0;
                if(i+1<=n && a[i]<a[i+1]) {
                    for (j = i+1; j <=n && cnt2<10; j++) {
                        if(a[i]<a[j]) cnt2++;
                        else break;
                    }
                }
                if(cnt2>=y) {
                    ans = i;
                    break;
                }else {
                    if(cnt2<y && j==n+1) {
                        ans = i;
                        break;
                    }
                }
            }
            else if(i==n) {
                int j=0;
                for ( j = i-1; j >0 && cnt1<10 ; j--) {
                    if(a[j]>a[i]) cnt1++;
                    else break;
                }
                if(cnt1 >= x) {
                    ans = i;
                    break;
                }
                else {
                    if(cnt1<x && j==0) {
                        ans = i;
                        break;
                    }
                }
            }
            else {
                cnt1 = 0;
                cnt2 = 0;
                int j=0,k=0;
                if(a[i]<a[i-1] && a[i]<a[i+1]) {
                    for (j = i+1; j <=n && cnt2<10; j++) {
                        if(a[i]<a[j]) cnt2++;
                        else break;
                    }
                    for (k = i-1; k >0 && cnt1<=10 ; k--) {
                        if(a[k]>a[i]) cnt1++;
                        else break;
                    }
                    //System.out.println(cnt1+" "+i+" "+cnt2);
                    if(cnt1>=x && cnt2>=y) {
                        ans = i;
                        break;
                    }
                    else if((cnt1<x && k==0 && cnt2>=y) || (cnt1>=x && j==n+1 && cnt2<y) || (cnt1<x && cnt2<y && j==n+1 && k==0)) {
                        //System.out.println(k+" "+j);
                        ans = i;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
