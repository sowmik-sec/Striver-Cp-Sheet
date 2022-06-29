package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] ch = new int[10000];
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i)-'a']++;
        }
        int cnt = 0;
        for (int i = 0; i < 10000; i++) {
            if(ch[i]>0) cnt++;
        }
        if(cnt%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
