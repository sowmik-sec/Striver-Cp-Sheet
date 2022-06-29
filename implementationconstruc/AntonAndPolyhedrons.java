package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            String s = in.next();
            if(s.equals("Tetrahedron")) ans += 4;
            else if(s.equals("Cube")) ans += 6;
            else if(s.equals("Octahedron")) ans += 8;
            else if(s.equals("Dodecahedron")) ans += 12;
            else ans += 20;
        }
        System.out.println(ans);
    }
}
