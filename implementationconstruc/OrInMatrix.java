package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class OrInMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        int[][] ans = new int[n][m];
        int[][] ansOfAns = new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]==1) {
                    int cnt = 0;
                    for (int k = 0; k < m; k++) {
                        if(a[i][k]==1) cnt++;
                        else break;
                    }
                    if(cnt==m) {
                        int cnt2 = 0;
                        for (int k = 0; k < n; k++) {
                            if(a[k][j]==1) cnt2++;
                            else break;
                        }
                        if(cnt2==n) {
                            ans[i][j] = 1;
                        }
                    }
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if(ans[i][j]==1) {
                    for (int k = 0; k < m; k++) {
                        ansOfAns[i][k] = 1;
                    }
                    for (int k = 0; k < n; k++) {
                        ansOfAns[k][j] = 1;
                    }
                }
            }
        }
        String flag = "YES";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]!=ansOfAns[i][j]) {
                    flag = "NO";
                    break;
                }
            }
        }
        if(flag=="NO") System.out.println(flag);
        else {
            System.out.println(flag);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
