package striverCpSheet.implementationconstruc;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleHashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0) {
            t--;
            String p = in.next();
            String h = in.next();
            char[] c = p.toCharArray();
            Arrays.sort(c);
            String ahs = "NO";
            for (int i = 0; i <= h.length()-p.length(); i++) {
                //if(i+p.length()<h.length()) {
                    String temp = h.substring(i,i+p.length());
                    //System.out.println(temp);
                    char[] ch = temp.toCharArray();
                    Arrays.sort(ch);
                    int cnt = 0;
                    for (int j = 0; j < p.length(); j++) {
                        if(c[j]==ch[j]) {
                            cnt++;
                        }
                        else break;
                    }
                    if(cnt==p.length()) {
                        ahs = "YES";
                        break;
                    }
                }
            //}
            System.out.println(ahs);
        }
    }
}
