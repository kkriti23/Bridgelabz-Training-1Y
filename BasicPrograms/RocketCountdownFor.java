import java.util.Scanner;
public class RocketCountdownFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown :");
        int m = sc.nextInt();
        for(int i=m ; i>0 ; i--){
            System.out.println(i);
        }
    }
}
