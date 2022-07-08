package striverCpSheet.implementationmath;

import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            x += a;
            y += b;
            z += c;
        }
        if(x==y && y==z && x==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
