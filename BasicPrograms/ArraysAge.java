import java.util.Scanner;
public class ArraysAge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<length;i++){
            if(arr[i]>17){
                System.out.println("The student with the age "+arr[i]+" can vote.");
            }else{
                System.out.println("The student with the age "+arr[i]+" cannot vote.");
            }
        }
    }
}