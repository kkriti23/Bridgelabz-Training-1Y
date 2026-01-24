import java.util.Scanner;
public class SpringSeason{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month :");
        int m = sc.nextInt();
        System.out.print("Enter day :");
        int n = sc.nextInt();
        if(m<=5&&m>=3){
            if(m==3&&n<21 || m==5&&n>20){
                System.out.println("NOT a spring season");
            }else{
                System.out.println("It's a spring season");
            }
        }else{
            System.out.println("NOT a spring season");
        }
    }
}
