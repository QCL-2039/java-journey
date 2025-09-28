package OOP.Problem5;

import java.util.ArrayList;

public class Book {

    public String name;
    public String author;
    public String ISBN;

    public Book(String name, String author, String ISBN) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static void removeBook(ArrayList<Book> bookList, String ISBN) {
        for (Book b : bookList) {
            if (ISBN.equalsIgnoreCase(b.ISBN)) {
                System.out.println("Found and removed from the booklist with ISBN of Book: " + ISBN);
                bookList.remove(b);

            } else {
                System.out.println("Not found in the booklist.");
            }
        }

    }

    public static void showList(ArrayList<Book> bookList) {
        for (Book b : bookList) {
            System.out.println("Book Name: " + b.name + ",Author name: " + b.author + ",ISBN: " + b.ISBN);
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Book b = new Book("C", "Dennies Ritche", "3030");
        Book b1 = new Book("Java", "Sohel Rana", "2030");
        bookList.add(b);
        bookList.add(b1);
        // bookList.remove(b);
        showList(bookList);
        removeBook(bookList, "3030");
        showList(bookList);
        removeBook(bookList, "4040");
        showList(bookList);

    }

}
