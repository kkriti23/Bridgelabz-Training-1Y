package LibraryManagement2;


import java.io.PrintStream;
import java.util.ArrayList;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(int id, String name) {
        books.add(new Book(id, name));
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found. Add some first!");
            return;
        }
        for (Book b : books) {
            System.out.println("ID: " + b.getId() + " | Name: " + b.getName() + " | [" + (b.isIssued() ? "Issued" : "Available") + "]");
        }
    }

    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (!b.isIssued()) {
                    b.setIssued(true);
                    System.out.println("Book issued!");
                } else {
                    System.out.println("Already issued.");
                }
                return;
            }
        }
        System.out.println("ID not found.");
    }

    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                b.setIssued(false);
                System.out.println("Book returned!");
                return;
            }
        }
        System.out.println("ID not found.");
    }
}