package com.teclabs.assi;

import java.util.Scanner;

public class substring{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string (str1): ");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string (str2): ");
        String str2 = scanner.nextLine();

        boolean result = isSubstring(str1, str2);
        if (result) {
            System.out.println("\"" + str2 + "\" is a substring of \"" + str1 + "\".");
        } else {
            System.out.println("\"" + str2 + "\" is not a substring of \"" + str1 + "\".");
        }

        scanner.close();
    }

    public static boolean isSubstring(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len2 > len1) {
            return false;
        }

        for (int i = 0; i <= len1 - len2; i++) {
            int j;
            for (j = 0; j < len2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
            }
            
            if (j == len2) {
             return true;
            }
        }
         return false;
    }
}

