import java.util.Scanner;
public class SumOfNumUntil0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int m;
        do{
            System.out.print("Enter number :");
            m = sc.nextInt();
            if(m != 0)
                sum = sum + m;
        }while(m != 0);
        System.out.println(sum);
    }
}
