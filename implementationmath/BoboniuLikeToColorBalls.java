package striverCpSheet.implementationmath;

import java.util.Scanner;

public class BoboniuLikeToColorBalls {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0) {
            int[] a = new int[4];
            int odd = 0, even =0, ze = 0;
            for (int i = 0; i < 4; i++) {
                a[i] = in.nextInt();
                if(a[i]%2==0) even++;
                else odd++;
                if(i<3 && a[i]==0) ze=1;
            }
            if(ze==1 && odd>=2) {
                System.out.println("NO");
                continue;
            }
            if(even>=3 || odd>=3) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
