package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class BeautirulMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[5][5];
        int row = -1, col = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = in.nextInt();
                if(a[i][j]==1) {
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(Math.abs(row-2)+Math.abs(col-2));
    }
}
