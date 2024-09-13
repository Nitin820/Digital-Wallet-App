package com.solidprinciple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library library = new library();

        
        System.out.println("Enter number of books to add: ");
        int bookCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < bookCount; i++) {
            System.out.println("Enter book title: ");
            String title = scanner.nextLine();
            System.out.println("Enter book author: ");
            String author = scanner.nextLine();
            library.addBook(new book(title, author));
        }

       
        System.out.println("Enter number of members to add: ");
        int memberCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < memberCount; i++) {
            System.out.println("Enter member name: ");
            String name = scanner.nextLine();
            System.out.println("Enter member ID: ");
            String memberId = scanner.nextLine();
            library.addMember(new member(name, memberId));
        }

        
        System.out.println("Enter member name to borrow a book: ");
        String memberName = scanner.nextLine();
        member member = library.findMemberByName(memberName);

        if (member != null) {
            System.out.println("Enter book title to borrow: ");
            String bookTitle = scanner.nextLine();
            book book = library.findBookByTitle(bookTitle);

            if (book != null) {
                library.borrowBook(book, member);
            } else {
                System.out.println("Book not found!");
            }
        } else {
            System.out.println("Member not found!");
        }

        
        System.out.println("Enter member name to return a book: ");
        memberName = scanner.nextLine();
        member = library.findMemberByName(memberName);

        if (member != null) {
            System.out.println("Enter book title to return: ");
            String bookTitle = scanner.nextLine();
            book book = library.findBookByTitle(bookTitle);

            if (book != null) {
                library.returnBook(book, member);
            } else {
                System.out.println("Book not found!");
            }
        } else {
            System.out.println("Member not found!");
        }

        
        library.listAvailableBooks();

        scanner.close();
    }
}

