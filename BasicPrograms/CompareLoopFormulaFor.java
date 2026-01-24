import java.util.Scanner;
public class CompareLoopFormulaFor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        
        if(n>0){
            int Sum1 = n*(n+1)/2;
            int Sum2 = 0;
            for(int i=n;i>0;i--){
                Sum2+=i;
            }
            if(Sum1==Sum2){
                System.out.println("sum : "+Sum1);
            }   
        }else{
            System.out.println("Not natural number");
        }
        
    }
}

