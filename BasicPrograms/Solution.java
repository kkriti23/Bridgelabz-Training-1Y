import java.util.Scanner;
class Solution {
    public void MoveZeroes(int[] arr) {
        int current = 0;
        int zeroIndex = arr.length-1;
        int i=0;
        while(i<zeroIndex){
            if(arr[i]==0){
                current = i;
                while(current<zeroIndex){
                    arr[current]=arr[current+1];
                    current++;
                }
                arr[zeroIndex]=0;
                zeroIndex--;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :");
        int size = sc.nextInt();
        System.out.println("Enter elements of arrays");
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        obj.MoveZeroes(arr);
        System.out.println("Solution after moving zeros :");
        for(int i=0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}