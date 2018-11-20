package com.lsy;

import java.util.Scanner;

public class ReverseStr {

    public static void main(String[] args) {
        while (true) {
            System.out.println("待反转字符串：");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            System.out.println("反转后字符串：\n" + reverse(s) + "\n");
        }
    }

    private static String reverse(String s) {
        if(s == null || s.length() <= 1){
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
