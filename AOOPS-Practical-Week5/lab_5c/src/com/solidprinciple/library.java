package com.solidprinciple;


	import java.util.ArrayList;
	import java.util.List;

	public class library implements borrow, returnable {
	    private List<book> books;
	    private List<member> members;

	    public library() {
	        this.books = new ArrayList<>();
	        this.members = new ArrayList<>();
	    }

	    
	    public void addBook(book book) {
	        books.add(book);
	    }

	    
	    public void addMember(member member) {
	        members.add(member);
	    }

	    @Override
	    public void borrowBook(book book, member member) {
	        if (book.isAvailable()) {
	            book.setAvailable(false);
	            System.out.println(member.getName() + " borrowed " + book.getTitle());
	        } else {
	            System.out.println("Book is currently unavailable");
	        }
	    }

	   /* @Override
	    public void returnBook(book book, member member) {
	        if (!book.isAvailable()) {
	            book.setAvailable(true);
	            System.out.println(member.getName() + " returned " + book.getTitle());
	        } else {
	            System.out.println("This book was not borrowed");
	        }
	    } */
	    
	    public void listAvailableBooks() {
	        System.out.println("Available Books:");
	        for (book book : books) {
	            if (book.isAvailable()) {
	                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
	            }
	        }
	    }

	   
	    public book findBookByTitle(String title) {
	        for (book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                return book;
	            }
	        }
	        return null;
	    }

	    
	    public member findMemberByName(String name) {
	        for (member member : members) {
	            if (member.getName().equalsIgnoreCase(name)) {
	                return member;
	            }
	        }
	        return null;
	    }


		@Override
		public void returnBook(book book, member member) {
			// TODO Auto-generated method stub
			
		}
	}


