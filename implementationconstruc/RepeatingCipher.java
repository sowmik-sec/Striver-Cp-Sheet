package striverCpSheet.implementationconstruc;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.next();
        int cnt = 0;
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            boolean ahs = false;
            for (int j = 0; j < i; j++) {
                if(cnt+j<s.length() && !ahs) {
                    list.add(s.charAt(cnt+j));
                    ahs = true;
                }
            }
            cnt=i*(i+1)/2;
            //System.out.println(cnt);
            //System.out.println();
        }
        if(n==1) {
            System.out.println(s);
            return;
        }
        for(char c:list) System.out.print(c);
        System.out.println();
    }
}
