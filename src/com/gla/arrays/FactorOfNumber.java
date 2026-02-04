package com.gla.arrays;
import java.util.Scanner;
public class FactorOfNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        int maxfact =10;
        int [] factor = new int[maxfact];
        int index =0;

        for (int i = 1; i < number; i++) {
            if(number % i==0){
                if(index == maxfact){
                    maxfact *= 2;
                    int[] temp =new int[maxfact];

                    for (int j = 0; j < factor.length; j++) {
                        temp[j] = factor[j];
                    }
                    factor = temp;
                }
                factor[index] =i;
                index++;
            }
        }
        System.out.println("factor of " + number + " are ");
        for (int i = 0; i < index; i++) {
            System.out.println(factor[i] + " ");
        }
    }
}