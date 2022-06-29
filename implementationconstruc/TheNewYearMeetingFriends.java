package striverCpSheet.implementationconstruc;

import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int temp1 = (a[2]-a[0]) + (a[2]-a[1]);
        int temp2 = (a[1]-a[0]) + (a[2]-a[1]);
        System.out.println(Math.min(temp1,temp2));
    }
}
