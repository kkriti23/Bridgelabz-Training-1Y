package LibraryManagement2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Library Management System ===");

        while (running) {
            System.out.println("\n1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Enter Book Name: ");
                    String name = scanner.nextLine();
                    lib.addBook(id, name);
                    break;

                case 2:
                    System.out.println("\n--- Library Collection ---");
                    lib.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = scanner.nextInt();
                    lib.issueBook(issueId);
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = scanner.nextInt();
                    lib.returnBook(returnId);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
    }
}