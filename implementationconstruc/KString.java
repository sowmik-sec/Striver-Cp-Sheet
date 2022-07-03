package striverCpSheet.implementationconstruc;

import java.util.HashMap;
import java.util.Scanner;

public class KString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        in.nextLine();
        String s = in.next();
        HashMap<Character,Integer> ch = new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(ch.containsKey(s.charAt(i))) {
                Integer a = ch.get(s.charAt(i));
                a++;
                ch.put(s.charAt(i),a);
            }
            else {
                Integer a= 1;
                ch.put(s.charAt(i),a);
            }
        }
        boolean ahs = true;
        for(Integer val:ch.values()) {
            if(val%k>0) {
                ahs = false;
                break;
            }
        }
        if(ahs) {
            String temp = new String();
            for(Character c:ch.keySet()) {
                for(int i=0;i<ch.get(c)/k;i++) {
                    temp += c;
                }
            }
            String ans = new String();
            for (int i = 0; i < k; i++) {
                ans += temp;
            }
            System.out.println(ans);
        }
        else System.out.println(-1);
    }
}
