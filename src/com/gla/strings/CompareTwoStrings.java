package com.gla.string;
import java.util.Scanner;
public class CompareTwoStrings {
    public static boolean compare(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 :");
        String str1 = sc.next();
        System.out.println("Enter string 2 :");
        String str2 = sc.next();
        boolean method_compare = compare(str1 , str2);
        boolean equals_compare = str1.equals(str2);
        System.out.println("String 1 : "+str1);
        System.out.println("String 2 : "+str2);
        System.out.println("Same result : "+(method_compare==equals_compare));
    }
}
