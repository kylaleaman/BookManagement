package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library patron who can borrow and return books.
 */
public class Patron {
    
    //Properties
    
    /** The name of the patron. */
    private String name;
    
    /** The address of the patron. */
    private String address;
    
    /** The phone number of the patron. */
    private String phoneNumber;
    
    /** The list of books borrowed by the patron. */
    private List<Book> booksBorrowed;

    //Constructors
    
    /**
     * Constructs a patron with the specified name, address, and phone number.
     * @param name The name of the patron.
     * @param address The address of the patron.
     * @param phoneNumber The phone number of the patron.
     */
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.booksBorrowed = new ArrayList<>();
    }

    //Getters and Setters
    
    /**
     * Returns the name of the patron.
     * @return The name of the patron.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the patron.
     * @param name The name of the patron.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the address of the patron.
     * @return The address of the patron.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the patron.
     * @param address The address of the patron.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the phone number of the patron.
     * @return The phone number of the patron.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the patron.
     * @param phoneNumber The phone number of the patron.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the list of books borrowed by the patron.
     * @return The list of books borrowed by the patron.
     */
    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    /**
     * Sets the list of books borrowed by the patron.
     * @param booksBorrowed The list of books borrowed by the patron.
     */
    public void setBooksBorrowed(List<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    /**
     * Borrows a book and adds it to the list of books borrowed by the patron.
     * @param book The book to borrow.
     */
    public void borrowBook(Book book) {
        booksBorrowed.add(book);
    }

    /**
     * Borrows a book from the given list of books and adds it to the list of books borrowed by the patron.
     * @param books The list of books available for borrowing.
     * @param book The book to borrow.
     */
    public void borrowBook(List<Book> books, Book book) {
        if (books.contains(book)) {
            if (book.getNumCopies() > 0) {
                book.borrow();
                booksBorrowed.add(book); 
            } else {
                System.out.println("Book unavailable");
            }
        } else {
            System.out.println("Book not found");
        }
    }

    /**
     * Returns a borrowed book and removes it from the list of books borrowed by the patron.
     * @param book The book to return.
     */
    public void returnBook(Book book) {
       if (booksBorrowed.remove(book)) {
            booksBorrowed.remove(book);
       } else {
            System.out.println("Book not borrowed by patron");
       }
    }
    
}
