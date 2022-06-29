package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();
        int nl = in.nextInt();
        int np = in.nextInt();
        int total_drink = k*l;
        int total_lime_slice = c*d;
        int drink = total_drink/nl;
        int salt = p/np;
        int temp = Math.min(drink,Math.min(total_lime_slice,salt));
        System.out.println(temp/n);
    }
}
