import java.util.Scanner;
public class ArrayTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ; ");
        int n = sc.nextInt();
        int length = 11;
        int[] arr = new int[length];
        for(int i=1;i<length;i++){
            arr[i]= n*i;
            System.out.println(n+" * "+i+" = "+arr[i]);
        }
    }
}
