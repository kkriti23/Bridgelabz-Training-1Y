import java.util.Scanner;
public class SmallestOfThree{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number : ");
    int number1 = sc.nextInt();
    System.out.print("Enter second number : ");
    int number2 = sc.nextInt();
    System.out.print("Enter third number : ");
    int number3 = sc.nextInt();
    System.out.println("Is the first number the smallest?");
    int min;
    if(number1<number2){
        min = number1;
    }else{
        min = number2;
    }
    if(min<number3){
        System.err.println(min);
    }else{
        System.out.println(number3);
    }
}
}