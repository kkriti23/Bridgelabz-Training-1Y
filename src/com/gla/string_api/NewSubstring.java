package com.gla.strings;
import java.util.Scanner;
public class NewSubstring {
    public static String method(String str,int start,int end) {
        String substring = "";
        for(int i=start;i<=end;i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.next();
        System.out.println("Enter start : ");
        int start = sc.nextInt();
        System.out.println("Enter end : ");
        int end = sc.nextInt();
        String manual = method(str,start,end);
        String builtIn=str.substring(start,end+1);
        System.out.println("\nOriginal string: '" + str + "'");
        System.out.println("Manual substring (charAt): '" + manual + "'");
        System.out.println("Built-in substring(): '" + builtIn + "'");
    }
}
