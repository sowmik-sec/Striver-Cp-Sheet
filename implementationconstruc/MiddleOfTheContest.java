package striverCpSheet.implementationconstruc;

import java.util.Scanner;

public class MiddleOfTheContest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int num1=0,num2=0,num3=0,num4=0;
        String temp = new String();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==':') {
                num1 = toInt(temp);
                temp = new String();
            }
            else {
                temp += s.charAt(i);
            }
        }
        num2 = toInt(temp);
        temp = new String();
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i)==':') {
                num3 = toInt(temp);
                temp = new String();
            }
            else {
                temp += t.charAt(i);
            }
        }
        num4 = toInt(temp);
        int total_minute = 0;
        int total_hours = 0;
        int total_time = 0;
        if(num4>num2) {
            total_minute = num4 - num2;
            total_hours = num3 - num1;
        }
        else {
            total_minute = 60-num2 + num4;
            total_hours = num3 - num1 - 1;
        }
        total_time = total_hours*60 + total_minute;
        total_time/=2;
        total_hours = total_time / 60;
        total_minute = total_time % 60;
//        System.out.println(num1+" "+num2+" "+num3+" "+num4);
//        System.out.println(total_hours+" "+total_minute);
        int final_hour = 0, final_minute = 0;
        if(num2+total_minute>=60) {
            final_minute = (num2+total_minute)%60;
            final_hour = num1 + total_hours + 1;
        }else {
            final_minute = num2+total_minute;
            final_hour = num1 + total_hours;
        }
        //System.out.printf("%2d:%2d",final_hour,final_minute);
        if(countDigit(final_hour)==1) {
            if(final_hour==0) System.out.print("00:");
            else System.out.print("0"+final_hour+":");
        }
        else System.out.print(final_hour+":");
        if(countDigit(final_minute)==1) {
            if(final_minute==0) System.out.println("00");
            else System.out.println("0"+final_minute);
        }
        else System.out.println(final_minute);
    }

    private static int countDigit(int digit) {
        String s = String.valueOf(digit);
        return s.length();
    }

    private static int toInt(String temp) {
        int ans = 0;
        for (int i = 0; i < temp.length(); i++) {
            ans = ans*10 + temp.charAt(i)-'0';
        }
        return ans;
    }
}
