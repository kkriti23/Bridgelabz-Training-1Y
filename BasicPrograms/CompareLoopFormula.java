import java.util.Scanner;
public class CompareLoopFormula{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int Sum1 = n*(n+1)/2;
        int Sum2 = 0;
        while(n>0){
            Sum2 += n;
            n--;
        }
        if(Sum1==Sum2){
            System.out.println("sum : "+Sum1);
        }
    }
}
