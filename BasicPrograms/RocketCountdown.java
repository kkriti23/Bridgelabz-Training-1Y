import java.util.Scanner;
public class RocketCountdown{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown :");
        int m = sc.nextInt();
        while(m>0){
            System.out.println(m);
            m--;
        }
    }
}
