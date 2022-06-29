package striverCpSheet.implementationconstruc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                list.add(s.charAt(i)-'0');
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i)+"+");
        }
        System.out.println(list.get(list.size()-1));
    }
}
