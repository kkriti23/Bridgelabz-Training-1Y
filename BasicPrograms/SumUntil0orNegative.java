import java.util.Scanner;
public class SumUntil0orNegative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter number : ");
        int m = sc.nextInt();
        while(m>0){
            sum += m;
            System.out.print("Enter number : ");
            m = sc.nextInt();
        }
        System.out.println(sum);
    }
}
