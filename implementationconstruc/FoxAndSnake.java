package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        boolean ahs = false;
        int index = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i%2==0) {
                    System.out.print("#");
                }
                else if(j==m-1 && ahs==false) {
                    System.out.print("#");
                    ahs = true;
                }
                else if(j==0 && ahs == true) {
                    System.out.print("#");
                    index = i;
                }
                else System.out.print(".");
            }
            System.out.println();
            //if()
        }
    }
}
