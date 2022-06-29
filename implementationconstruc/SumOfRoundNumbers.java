package striverCpSheet.implementationconstruc;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            ArrayList<String> arr = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                String st = new String();
                if(s.charAt(j)!='0') {
                    st+=s.charAt(j);
                    for (int k = 0; k < s.length()-j-1; k++) {
                        st+=0;
                    }
                    arr.add(st);
                }
            }
            System.out.println(arr.size());
            //System.out.println(arr);
            for(String tt:arr) System.out.print(tt+" ");
            System.out.println();
        }
    }
}
