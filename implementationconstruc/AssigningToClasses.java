package striverCpSheet.implementationconstruc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AssigningToClasses {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            int n = in.nextInt();
            int[] a = new int[n*2];
            for (int i = 0; i < n*2; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            /*
            int mx = Integer.MIN_VALUE;
            int index = -1;
            int ans = -1;
            for (int i = 1; i < n*2; i++) {
                int temp = a[i] - a[i-1];
                if(temp>mx) {
                    mx = temp;
                    index = i;
                }
            }
            System.out.println(index);
            for(int num:a) System.out.print(num+" ");
            System.out.println();
            if((index%2==1)) {
                for (int i = 1; i < index; i++) {
                    ans = Math.max(ans,a[i]-a[i-1]);
                }
                for (int i = index+1; i < n*2; i++) {
                    ans = Math.max(ans,a[i]-a[i-1]);
                }
                System.out.println(ans);
            }
            else System.out.println(mx);
             */

            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            if(n%2==1) {
                for (int i = 0; i < n*2; i++) {
                    if(i%2==0) list1.add(a[i]);
                    else list2.add(a[i]);
                }
                System.out.println(Math.abs(list1.get(list1.size()/2)-list2.get(list2.size()/2)));
            }
            else {
                list2.add(a[n]);
                for (int i = 0; i < n*2; i++) {
                    if(i==n) continue;
                    list1.add(a[i]);
                }
                System.out.println(Math.abs(list1.get(list1.size()/2)-list2.get(list2.size()/2)));
            }
        }
    }
}
