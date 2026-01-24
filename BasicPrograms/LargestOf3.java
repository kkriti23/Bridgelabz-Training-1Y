import java.util.Scanner;
public class LargestOf3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt(); 
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();
        System.out.println("Is the first number the largest?");
        if(num1>num2 && num1>num3){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println("Is the second number the largest?");
        if(num2>num1 && num2>num3){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        System.out.println("Is the third number the largest?");
        if(num3>num1 && num3>num2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}