import java.util.Scanner;
public class userInput{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is yor name?");
        String name = scanner.nextLine();

        System.out.println("Your age?");
        int age = scanner.nextInt();
        scanner.nextLine();                       //consumes \n left by nextInt

        System.out.println("Favorite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your favorite food is " + food);

        scanner.close();
    }
}